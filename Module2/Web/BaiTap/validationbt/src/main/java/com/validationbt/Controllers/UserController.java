package com.validationbt.Controllers;

import com.validationbt.Models.User;
import com.validationbt.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("/")
    public String getSignUp(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/")
    public String postSignUp(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {

        if (bindingResult.hasFieldErrors()) {
            return "index";
        }
        userServices.save(user);
        model.addAttribute("message", "Welcome" + user.getFirstName() + user.getLastName());
        return "result";

    }
}
