package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.TuDien;

@Controller
public class TuDienTiengAnh {

    @Autowired
    TuDien tuDien;

    @PostMapping("/tudien")
    public String traCuu(@RequestParam String VN,
                         Model model){
        model.addAttribute("message",tuDien.search(VN));
        return "KetQua";
    }
}
