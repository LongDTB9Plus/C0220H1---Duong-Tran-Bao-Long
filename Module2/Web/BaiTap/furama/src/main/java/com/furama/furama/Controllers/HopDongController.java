package com.furama.furama.Controllers;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Services.HopDongServices;
import com.furama.furama.Services.KhachHangServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class HopDongController {
    @Autowired
    HopDongServices hopDongServices;
    @Autowired
    KhachHangServices khachHangServices;

    @GetMapping("/create-contract")
    public String getCreateContract(@RequestParam Optional<Integer> id,Model model
            ,RedirectAttributes redirectAttributes){
        if (id.isPresent()){
            model.addAttribute("khachHang",khachHangServices.findById(id.get()));
            model.addAttribute("HopDong",new HopDong());
            return "main";
        }
        redirectAttributes.addFlashAttribute("hopDong",new HopDong());
        return "redirect:/search";
    }

    @PostMapping("/create-contract")
    public String postCreateContract(@Valid @ModelAttribute(value = "HopDong") HopDong hopDong, BindingResult result,
                                     Model model){
        new HopDong().validate(hopDong,result);
        if (result.hasFieldErrors()){
            return "redirect:/create-contract";
        }else {
            hopDongServices.save(hopDong);
            model.addAttribute("message","Khoi Tao Hop Dong Thanh Cong!");
            return "main";
        }
        }
}
