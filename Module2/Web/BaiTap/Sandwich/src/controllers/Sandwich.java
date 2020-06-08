package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.Get;

import java.util.Optional;

@Controller
public class Sandwich {

    @Autowired
    Get get;

    @PostMapping("/sandwich")
    public String process(@RequestParam Optional<String[]> ele,
                          Model model){
        if (ele.isPresent()) {
            model.addAttribute("AllElement", get.returnString(ele.get()));
        }
return "Element";
    }

}
