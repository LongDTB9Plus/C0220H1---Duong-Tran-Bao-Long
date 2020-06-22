package com.banhang.controllers;

import com.banhang.models.Customer;
import com.banhang.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@SessionAttributes("account")
public class LoginController {
    @Autowired
    CustomerServices customerServices;

    @GetMapping("/")
    public String getLogin(Model model) {
        model.addAttribute("customer",new Customer());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@ModelAttribute Optional<Customer> customer,
                            Model model,RedirectAttributes redirectAttributes) {
        if (customer.isPresent()) {
            String check = customerServices.checkLoginAccount(customer.get());
            redirectAttributes.addFlashAttribute("message", check);
            if (check.startsWith("Welcome")) {
                Customer account = customerServices.findByUsername(customer.get().getUsername());
                model.addAttribute("account",account);
                return "main";
            } else return "redirect:/";
        } else return "redirect:/";
    }


    @GetMapping("/register")
    public String getRegister(Model model) {
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(@Valid @ModelAttribute Customer customer, BindingResult result, RedirectAttributes attributes, HttpServletResponse response) {
        if (result.hasFieldErrors()) {
            return "register";
        } else {
            customerServices.save(customer);
            Cookie cookieUsername = new Cookie("cookieUsername", customer.getUsername());
            Cookie cookiePassword = new Cookie("cookiePassword", customer.getPassword());
            response.addCookie(cookieUsername);
            response.addCookie(cookiePassword);
            attributes.addFlashAttribute("registerMessage", "Register Successful");
            return "redirect:/";
        }
    }

    @GetMapping("/logout")
    public String getLogOut(){
        return "redirect:/";
    }
}
