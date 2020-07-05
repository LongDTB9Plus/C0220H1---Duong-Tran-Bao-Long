package com.furama.furama.Controllers;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Models.HopDongChiTiet;
import com.furama.furama.Services.DichVuDiKemServices;
import com.furama.furama.Services.HopDongChiTietServices;
import com.furama.furama.Services.HopDongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HopDongChiTietController {
    @Autowired
    HopDongChiTietServices hopDongChiTietServices;
    @Autowired
    HopDongServices hopDongServices;
    @Autowired
    DichVuDiKemServices dichVuDiKemServices;


    @GetMapping("/create-detail-services")
    public String getCreateDetailServices(@RequestParam Integer id, Model model){
        model.addAttribute("listDichVuDiKem",dichVuDiKemServices.findAll());
        HopDongChiTiet hopDongChiTiet = new HopDongChiTiet();
        HopDong hopDong = hopDongServices.findById(id);
        hopDongChiTiet.setHopDong(hopDong);
        model.addAttribute("HopDongChiTiet",hopDongChiTiet);
        model.addAttribute("hopDongChiDinh",hopDongServices.findById(id));
        return "themDichVuDiKem";
    }

    @PostMapping("/create-detail-services")
    public String postCreateDetailServices(@ModelAttribute HopDongChiTiet hopDongChiTiet,Model model){
        hopDongChiTietServices.save(hopDongChiTiet);
        model.addAttribute("message","Tao Moi Thanh Cong!");
        return "main";
    }
}
