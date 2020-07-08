package com.test2.controllers;

import com.test2.entity.Sach;
import com.test2.services.SachServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class SachController {

    @Autowired
    private SachServices sachService;

    @GetMapping("/")
    public String goMain() {
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String getList(@PageableDefault(size = 3) Pageable pageable, @RequestParam("message") Optional<String> message, Model model) {
        Page<Sach> listSach = sachService.findAll(pageable);
        model.addAttribute("danhSach", listSach);
        if ((message.isPresent()) && (!(message.get().isEmpty()))) {
            model.addAttribute("message", message);
        }
        return "list";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("sachMoi", new Sach());
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(@Valid @ModelAttribute("sachMoi") Sach sach,
                             BindingResult result, RedirectAttributes redirectAttributes) {
        sachService.validate(sach, result);
        if (result.hasFieldErrors()) {
            return "create";
        }
        new Sach().validate(sach, result);
        if (result.hasFieldErrors()) {
            return "create";
        }
        sachService.save(sach);
        redirectAttributes.addFlashAttribute("message", "Thêm Mới Thành Công");
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String getEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("sachChinhSua", sachService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String postEdit(@Valid @ModelAttribute("sachChinhSua") Sach sach, RedirectAttributes redirectAttributes) {
        sachService.save(sach);
        redirectAttributes.addFlashAttribute("message", "Chỉnh Sửa Thành Công!");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String getDelete(@RequestParam("maSach") Integer id, RedirectAttributes redirectAttributes) {
        sachService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Xoá Thành Công");
        return "redirect:/list";
    }

    @GetMapping("/search-by-key")
    public String searchByKey(@RequestParam("keyword") String keyword, @RequestParam("typeSearch") String type, Model model) {
        switch (type) {
            case "Ma Sach":
                if (!(keyword.isEmpty())) {
                    if (keyword.matches("^[0-9]+$")) {
                        List<Sach> foundList = sachService.findByMaSach(Integer.parseInt(keyword));
                        if (foundList.isEmpty()) {
                            model.addAttribute("message", "Không Tìm Thấy!");
                        }
                        model.addAttribute("list", foundList);
                        return "search";
                    }
                }
                return "search";
            case "Ten Sach": {
                if (!(keyword.isEmpty())) {
                    if (keyword.matches("^[0-9a-zA-Z]+$")) {
                        List<Sach> foundList = sachService.findByTenSach(keyword);
                        if (foundList.isEmpty()) {
                            model.addAttribute("message", "Không Tìm Thấy!");
                        }
                        model.addAttribute("list", foundList);
                        return "search";
                    }
                }
                return "search";
            }
        }
        return "search";
    }
}
