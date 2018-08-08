package com.moin.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {


    @GetMapping("/")
    public String index() {
//            m.addAttribute("someAttribute", "someValue");
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }
}