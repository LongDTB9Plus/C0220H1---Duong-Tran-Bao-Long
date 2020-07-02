package com.furama.furama.Controllers;

import com.furama.furama.Models.DichVu;
import com.furama.furama.Services.DichVuServices;
import com.furama.furama.Services.KieuThueService;
import com.furama.furama.Services.LoaiDichVuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class DichVuController {
    @Autowired
    DichVuServices dichVuServices;

    @Autowired
    KieuThueService kieuThueService;

    @Autowired
    LoaiDichVuServices loaiDichVuServices;

    @GetMapping("/create-services")
    public String getCreateServices(Model model){
        model.addAttribute("dichVu", new DichVu());
        model.addAttribute("listKieuThue",kieuThueService.findAll());
        model.addAttribute("listLoaiDichVu",loaiDichVuServices.findAll());
        return "main";
    }

    @PostMapping("/create-services")
    public String postCreateServices(@Valid @ModelAttribute(value = "dichVu") DichVu dichVu, BindingResult result,
                                     Model model){
        new DichVu().validate(dichVu,result);
        if (result.hasFieldErrors()){
            return "main";
        }else {
            dichVuServices.save(dichVu);
            model.addAttribute("message","Tao Dich Vu Moi Thanh Cong!");
            return "main";
        }
    }

    @GetMapping("/services")
    public String getServicesList(@PageableDefault(size = 5)Pageable pageable,Model model){
        model.addAttribute("listDichVu",dichVuServices.findAll(pageable));
        return "main";
    }

}
