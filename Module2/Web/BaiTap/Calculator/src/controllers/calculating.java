package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Calculate;
import services.Models.NumberIn;

@Controller
public class calculating {
    @Autowired
    Calculate calculate;

    @GetMapping("/index")
    public String showForm(Model model){
        model.addAttribute("number",new NumberIn());
        return ("process");
    }
    @PostMapping ("/calculate")
    public String calculating(@RequestParam String submit,
                            @ModelAttribute("number") NumberIn numberIn,
                              Model model){
        String result = calculate.Calculating(submit,numberIn);
        if (result.equals("invalid")){
            model.addAttribute("message",result);
        }else model.addAttribute("result",result);
        return "process";
    }
}
