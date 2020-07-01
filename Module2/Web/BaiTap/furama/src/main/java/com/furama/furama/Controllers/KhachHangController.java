package com.furama.furama.Controllers;

import com.furama.furama.Models.KhachHang;
import com.furama.furama.Models.User;
import com.furama.furama.Services.KhachHangServices;
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

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangServices khachHangServices;

    @GetMapping("/register-customer")
    public String getRegister(Model model) {
        model.addAttribute("KhachHang", new KhachHang());
        return "";
    }

    @PostMapping("/register-customer")
    public String postRegister(@Valid @ModelAttribute(value = "KhachHang") KhachHang khachHang, BindingResult result, Model model) {
        new KhachHang().validate(khachHang, result);
        if (result.hasFieldErrors()) {
            return "";
        } else {
            khachHangServices.save(khachHang);
            model.addAttribute("message", "Dang Ki Thanh Cong!");
            return "";
        }
    }

    @GetMapping("/customer")
    public String getCustomerList(@PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("list", khachHangServices.findAll(pageable));
        return "";
    }

    @GetMapping("/active-customer")
    public String getActiveCustomer(Model model){
        model.addAttribute("list",khachHangServices.findAllStillActive());
        return "main";
    }

    @GetMapping("/search-key")
    public String getSearch(@RequestParam Optional<String> keyword, Model model,
                            @PageableDefault(value = 5) Pageable pageable){

        if ((keyword.isPresent()) && (!(keyword.get().isEmpty()))){
            Page<KhachHang> listFound = khachHangServices.searchAll(keyword.get(),pageable);
            if (listFound.hasContent()){
                model.addAttribute("listSearch",listFound);
            }else {
                model.addAttribute("message","Not Found !");
            }
            return "search";
        }
        return "search";
    }

    @GetMapping("/search")
    public String getSearch(){
        return "search";
    }

}
