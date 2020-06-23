package com.banhang.controllers;

import com.banhang.models.Customer;
import com.banhang.models.Product;
import com.banhang.services.CustomerServices;
import com.banhang.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("account")
public class CustomerController {
    @Autowired
    CustomerServices customerServices;
    @Autowired
    ProductServices productServices;

    @GetMapping("/shopping")
    public String getShopping(@PageableDefault(size = 3) Pageable pageable, Model model) {
        model.addAttribute("products", productServices.findAll(pageable));
        return "shopping";
    }

    @GetMapping("/add")
    public String getAdd(@SessionAttribute Customer account, @RequestParam Integer id) {
        customerServices.addCart(account, id);
        return "redirect:/shopping";
    }

    @GetMapping("/checkout")
    public String getCheckOut(@SessionAttribute Customer account) {
        List<Customer> listC = new ArrayList<>();
        listC.add(account);
        account.getProductList().get(0).setCustomerList(listC);
        customerServices.save(account);
        return "checkout";
    }

    @PostMapping("/checkout")
    public String postCheckOut(@SessionAttribute Customer account,Model model) {
        customerServices.checkOut(account);
        model.addAttribute("message","Thank you!");
        return "main";
    }
    @GetMapping("/remove")
    public String getRemove(@SessionAttribute Customer account,@RequestParam Integer id){
        for (Product product: account.getProductList()
             ) {
            if (product.getId().equals(id)){
                account.getProductList().remove(product);
                break;
            }
        }
        return "checkout";
    }
}
