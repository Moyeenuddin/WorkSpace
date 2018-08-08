package com.cp.controller;

import com.cp.beans.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpController {
@RequestMapping ("/empform")
    public ModelAndView showform(){
    return new ModelAndView("empform","command",new Emp()); //command is a reserved request attribute name, now use <form> tag to show object data
    }


    @RequestMapping ("/save") //@RequestMapping (value = "/save",mathod=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("emp") Emp emp) {
        // need to write code to save emp object
        //here, we are displaying emp object to prove emp has data
        System.out.println("Name: " +emp.getName()+ "  Salary: " +emp.getSalary()+ " Designation: " +emp.getDesignation());
        //return new ModelAndView("empform","command",emp);//will display object data
//        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping
        return new ModelAndView("redirect:/viewemp");
    }


    @RequestMapping("/viewemp")
    public ModelAndView viewemp(){
    List<Emp> list=new ArrayList<Emp>();
    list.add(new Emp(1,"rahul", 35000f,"SoftEng"));
    list.add(new Emp(2,"aditya",25000f,"IT Manager"));
    list.add(new Emp(3,"sachin",55000f,"Care Taker"));

        //write the code to get all employees from DAO
        //here, we are writing manual code of list for easy understanding
//        List<Emp> list=new ArrayList<Emp>();
//        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));
//        list.add(new Emp(2,"aditya",25000f,"IT Manager"));
//        list.add(new Emp(3,"sachin",55000f,"Care Taker"));

        return new ModelAndView("viewemp","list",list);
    }
}
