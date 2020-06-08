package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Calculate;

@Controller
public class calculating {
    @Autowired
    Calculate calculate;

    @GetMapping("/calculate")
    public String calculating(@RequestParam String submit,
                            @RequestParam Double a,
                              @RequestParam Double b,
                              Model model){
        model.addAttribute("result",calculate.Calculating(submit,a,b));
        model.addAttribute("A",a);
        model.addAttribute("B",b);
        return "index";
    }
}
