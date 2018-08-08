package com.cp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
//    public ModelAndView helloWorld() {
//        String message = "HELLO SPRING MVC HOW R U";
//        return new ModelAndView("hellopage", "message", message);
//    }
    public String obj(){
        return "hellopage";
    }
}
