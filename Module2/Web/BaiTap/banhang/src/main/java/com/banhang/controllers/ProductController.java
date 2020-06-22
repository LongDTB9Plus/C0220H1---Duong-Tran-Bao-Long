package com.banhang.controllers;

import com.banhang.models.Customer;
import com.banhang.models.Product;
import com.banhang.services.CustomerServices;
import com.banhang.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("account")
public class ProductController {
    @Autowired
    ProductServices productServices;
    @Autowired
    CustomerServices customerServices;

    @GetMapping("/createProduct")
    public String getCreateProduct(@SessionAttribute Customer account, Model model) {
        if (customerServices.checkPermission(account)) {
            model.addAttribute("product", new Product());
            return "create";
        } else {
            model.addAttribute("message", "You Have No Permission To Access");
            return "main";
        }
    }

    @GetMapping("/create")
    public String getCreate(@Valid @ModelAttribute Product product, BindingResult result, Model model) {
        if (result.hasFieldErrors()) {
            return "create";
        } else {
            productServices.save(product);
            model.addAttribute("message","Created");
            return "main";
        }
    }
}
