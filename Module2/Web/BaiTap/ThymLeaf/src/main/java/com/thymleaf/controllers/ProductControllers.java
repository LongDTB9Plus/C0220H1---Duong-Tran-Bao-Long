package com.thymleaf.controllers;

import com.thymleaf.models.Product;
import com.thymleaf.services.ServicesProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductControllers {
    @Autowired
    ServicesProduct servicesProduct;

    @GetMapping("/")
    public String createObj(Model model) {
        model.addAttribute("products", servicesProduct.show());
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String editObj(@PathVariable Integer id, Model model) {
        model.addAttribute("product", servicesProduct.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editPostObj(@ModelAttribute(value = "product") Product product, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", servicesProduct.edit(product.getId(), product));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteGetObj(@PathVariable Integer id, Model model) {
        model.addAttribute("product", servicesProduct.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String deletePostObj(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", servicesProduct.delete(id));
        return "redirect:/";
    }
    @GetMapping("/create")
    public String createGetObj(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String createPostObj(@ModelAttribute Product product,RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message",servicesProduct.saveProduct(product));
        return "redirect:/";
    }
}
