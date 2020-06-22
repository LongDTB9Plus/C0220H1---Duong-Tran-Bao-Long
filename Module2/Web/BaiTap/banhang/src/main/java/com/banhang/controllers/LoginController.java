package com.banhang.controllers;

import com.banhang.models.Customer;
import com.banhang.services.CustomerServices;
import com.banhang.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
@Controller
@SessionAttributes("account")
public class LoginController {
    @Autowired
    CustomerServices customerServices;

    @GetMapping("/")
    public String getLogin(Model model){
        model.addAttribute("account",new Customer());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute Customer account, Model model, RedirectAttributes redirectAttributes){
        String check = customerServices.checkLoginAccount(account);
        model.addAttribute("message",check);
        if (check.startsWith("Welcome")){
            return "main";
        }else return "login";
    }

    @GetMapping("/register")
    public String getRegister(Model model){
        model.addAttribute("customer",new Customer());
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(@Valid @ModelAttribute Customer customer, BindingResult result, RedirectAttributes attributes, HttpServletResponse response){
    if(result.hasFieldErrors()){
        return "register";
    }else {
        customerServices.save(customer);
        Cookie cookieUsername =new Cookie("cookieUsername",customer.getUsername());
        Cookie cookiePassword =new Cookie("cookieUsername",customer.getPassWord());
        response.addCookie(cookieUsername);
        response.addCookie(cookiePassword);
        attributes.addFlashAttribute("registerMessage","Register Successful");
        return  "redirect:/login";
    }
    }
}
