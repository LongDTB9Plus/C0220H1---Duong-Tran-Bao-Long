package com.banhang.controllers;

import com.banhang.models.Customer;
import com.banhang.models.Product;
import com.banhang.services.CustomerServices;
import com.banhang.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public String getCreate(@Valid @ModelAttribute Product product, BindingResult result, Model model) throws IOException {
//        if (file.isEmpty()) {
//            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
//            return "redirect:/createProduct";
//        }
        if (result.hasFieldErrors()) {
            return "create";
        } else {
//            byte[] bytes = file.getBytes();
//            Path path =
            productServices.save(product);
            model.addAttribute("message","Created");
            return "main";
        }
    }
}
