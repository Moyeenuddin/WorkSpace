package com.cp.controller;

import com.cp.beans.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
@RequestMapping ("/")
    public ModelAndView showform(){
        return new ModelAndView("empform","command",new Emp()); //command is a reserved request attribute name, now use <form> tag to show object data
    }


    @RequestMapping ("/save") //@RequestMapping (value = "/save",mathod=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("emp") Emp emp) {

        System.out.println("Name: " +emp.getName()+ "  Salary: " +emp.getSalary()+ " Designation: " +emp.getDesignation());
        return new ModelAndView("empform","command",new Emp());
    }



}
