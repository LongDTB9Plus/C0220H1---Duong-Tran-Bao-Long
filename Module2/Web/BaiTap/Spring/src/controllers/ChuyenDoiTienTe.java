package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.ChuyenDoi;

@Controller
public class ChuyenDoiTienTe {

    @Autowired
    ChuyenDoi chuyenDoi;

    @PostMapping("/chuyendoi")
    public String processing(@RequestParam double usd,
                             Model model){
    model.addAttribute("ketqua",chuyenDoi.quyDoi(usd));
    return "result";
    }

}
