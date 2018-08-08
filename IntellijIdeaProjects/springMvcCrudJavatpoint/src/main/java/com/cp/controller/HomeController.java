package com.cp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public String helloWorld() {
return "home";
//        ModelAndView message = "<br>" + "<div style='text-align:center;'>" +
//                "<h3> Hello World, Spring MVC Tutorial</h3>message from CrunchifyHelloWorld.java " +
//                "</div>" +
//                "<br>" +
//                "<br>";
//        return new ModelAndView ("welcome", "message", message);
}
}
