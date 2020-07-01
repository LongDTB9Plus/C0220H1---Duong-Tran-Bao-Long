package com.furama.furama.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userInformation")
public class MainController {

    @GetMapping("/")
    public String getMain(){
        return "main";
    }
}
