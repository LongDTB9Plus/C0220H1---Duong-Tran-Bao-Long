package com.furama.furama.Controllers;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Services.HopDongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HopDongController {
    @Autowired
    HopDongServices hopDongServices;

    @GetMapping("/create-contract")
    public String getCreateContract(Model model){
        model.addAttribute("HopDong",new HopDong());
        return "";
    }

    @PostMapping("/create-contract")
    public String postCreateContract(@Valid @ModelAttribute(value = "HopDong") HopDong hopDong, BindingResult result,
                                     Model model){
        new HopDong().validate(hopDong,result);
        if (result.hasFieldErrors()){
            return "";
        }else {
            hopDongServices.save(hopDong);
            model.addAttribute("message","Khoi Tao Hop Dong Thanh Cong!");
            return "";
        }
        }
}
