package com.furama.furama.Controllers;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Models.KhachHang;
import com.furama.furama.Services.DichVuServices;
import com.furama.furama.Services.KhachHangServices;
import com.furama.furama.Services.LoaiKhachServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("listLoaiKhach")
public class KhachHangController {
    @Autowired
    KhachHangServices khachHangServices;

    @Autowired
    DichVuServices dichVuServices;

    @Autowired
    LoaiKhachServices loaiKhachServices;

    @GetMapping("/register")
    public String getSessionRegister(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("khachHangMoi",new KhachHang());
        return "redirect:/register-customer";
    }
    @GetMapping("/register-customer")
    public String getRegister(Model model,@ModelAttribute("khachHangMoi") Optional<KhachHang> khachHang) {
        khachHang.ifPresent(hang -> model.addAttribute("khachHangMoi", hang));
        model.addAttribute("listLoaiKhach", loaiKhachServices.findAll());
        return "main";
    }

    @PostMapping("/register-customer")
    public String postRegister(@Valid @ModelAttribute(value = "khachHangMoi") KhachHang khachHang, BindingResult result,
                               Model model,RedirectAttributes redirectAttributes,
                               HttpServletRequest httpServletRequest) {
        new KhachHang().validate(khachHang, result);
        khachHangServices.validate(khachHang, result);
        if (result.hasFieldErrors()) {
            model.addAttribute("org.springframework.validation.BindingResult.khachHangMoi", result);
            model.addAttribute("khachHangMoi",khachHang);
            return "main";
        }
        khachHangServices.save(khachHang);
        model.addAttribute("message", "Dang Ki Thanh Cong!");
        httpServletRequest.getSession().invalidate();
        return "redirect:/";

    }

    @GetMapping("/customer-list")
    public String getListCustomer(Model model, @PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("list", khachHangServices.findAll(pageable));
        return "main";
    }

    @GetMapping("/customer")
    public String getCustomerList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("list", khachHangServices.findAll(pageable));
        return "";
    }

    @GetMapping("/active-customer")
    public String getActiveCustomer(Model model) {
        model.addAttribute("list", khachHangServices.findAllStillActive());
        return "main";
    }
    
    @GetMapping("/search-key")
    public String getSearch(@ModelAttribute("mark") Optional<String> mark, @RequestParam Optional<String> keyword, Model model,
                            @PageableDefault(value = 5) Pageable pageable) {

        if ((keyword.isPresent()) && (!(keyword.get().isEmpty()))) {
            Page<KhachHang> listFound = khachHangServices.searchAll(keyword.get(), pageable);
            if (listFound.hasContent()) {
                model.addAttribute("listSearch", listFound);
            } else {
                model.addAttribute("message", "Not Found !");
            }
        }
        if (!(mark.get().isEmpty())) {
            model.addAttribute("hopDong", mark.get());
        }
        return "search";
    }

    @GetMapping("/search")
    public String getSearch(@ModelAttribute("mark") Optional<String> mark, Model model) {
        if (!(mark.get().isEmpty())) {
            model.addAttribute("mark", mark.get());
        }
        return "search";
    }

    @GetMapping("/edit-customer")
    public String getEdit(@RequestParam Integer id, Model model) {
        KhachHang khachHang = khachHangServices.findById(id);
        model.addAttribute("khachHang", khachHang);
        model.addAttribute("listDichVuDangKy", dichVuServices.findAll());
        return "edit";
    }

    @PostMapping("/edit-customer")
    public String postEdit(@Valid @ModelAttribute KhachHang khachHang, BindingResult result,
                           RedirectAttributes redirectAttributes) {
        new KhachHang().validate(khachHang, result);
        if (result.hasFieldErrors()) {
            return "redirect:/edit-customer?id=" + khachHang.getId();
        }
        List<HopDong> hopDongList = khachHangServices.findById(khachHang.getId()).getListHopDongKhachHang();
        khachHang.setListHopDongKhachHang(hopDongList);
        khachHangServices.save(khachHang);
        redirectAttributes.addFlashAttribute("message", "Chỉnh sửa thành công");
        return "redirect:/customer-list";
    }

    @GetMapping("/delete-customer")
    public String getDeleteCustomer(@RequestParam Integer id, Model model) {
        KhachHang khachHang = khachHangServices.findById(id);
        khachHangServices.remove(khachHang);
        model.addAttribute("message", "Xóa thành công!");
        return "main";
    }
}
