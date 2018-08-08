package com.cp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
        @RequestMapping("/index")
    public String mat(){
            return "index";
        }


//        public ModelAndView sayhello(){
//            String message = "HELLO SPRING MVC HOW R U";
//            return new ModelAndView("index", "message", message);
        }


