package com.furama.furama.Controllers;

import com.furama.furama.Models.KhachHang;
import com.furama.furama.Models.User;
import com.furama.furama.Services.KhachHangServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
        model.addAttribute("ListKhachHang", khachHangServices.findAll(pageable));
        return "";
    }

    @GetMapping("/active-customer")
    public String getActiveCustomer(Model model){
        model.addAttribute("ListKhachHang",khachHangServices.findAllStillActive());
        return "";
    }

    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("account",new User());
        return "";
    }
}
