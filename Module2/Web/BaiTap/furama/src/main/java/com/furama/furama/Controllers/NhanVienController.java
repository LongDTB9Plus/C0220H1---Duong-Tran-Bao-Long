package com.furama.furama.Controllers;

import com.furama.furama.Models.NhanVien;
import com.furama.furama.Services.BoPhanServices;
import com.furama.furama.Services.NhanVienServices;
import com.furama.furama.Services.TrinhDoServices;
import com.furama.furama.Services.ViTriServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes({"listViTri", "listBoPhan", "listTrinhDo"})
public class NhanVienController {
    @Autowired
    NhanVienServices nhanVienServices;
    @Autowired
    ViTriServices viTriServices;
    @Autowired
    BoPhanServices boPhanServices;
    @Autowired
    TrinhDoServices trinhDoServices;

    @GetMapping("/create-employee")
    public String getEmployee(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("listViTri", viTriServices.findAll());
        model.addAttribute("listBoPhan", boPhanServices.findAll());
        model.addAttribute("listTrinhDo", trinhDoServices.findAll());
        return "createCustomer";
    }

    @PostMapping("/create-employee")
    public String postEmployee(@Valid @ModelAttribute NhanVien nhanVien, BindingResult result, Model model) {
        new NhanVien().validate(nhanVien, result);
        if (result.hasFieldErrors()) {
            return "createCustomer";
        }
        nhanVienServices.save(nhanVien);
        model.addAttribute("message", "Khởi tạo thành công");
        return "main";
    }
}
