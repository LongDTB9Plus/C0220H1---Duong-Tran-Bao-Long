package com.furama.furama.Controllers;

import com.furama.furama.Models.HopDongChiTiet;
import com.furama.furama.Services.HopDongChiTietServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HopDongChiTietController {
    @Autowired
    HopDongChiTietServices hopDongChiTietServices;

    @GetMapping("/create-detail-services")
    public String getCreateDetailServices(Model model){
        model.addAttribute("HopDongChiTiet",new HopDongChiTiet());
        return "";
    }

    @PostMapping("/create-detail-services")
    public String postCreateDetailServices(@ModelAttribute HopDongChiTiet hopDongChiTiet,Model model){
        hopDongChiTietServices.save(hopDongChiTiet);
        model.addAttribute("message","Tao Moi Thanh Cong!");
        return "";
    }
}
