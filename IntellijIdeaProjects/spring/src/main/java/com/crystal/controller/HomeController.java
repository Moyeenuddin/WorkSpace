package com.crystal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {

        final String selectQuery = "select * from test_tbl where id=1";

//        Map<?, ?> map = jdbcTemplate.queryForMap(selectQuery);
//        model.addAttribute("data", map.toString());
        return "home";
    }
}
