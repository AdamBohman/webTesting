package com.bohman.webdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/index")
    public String showIndex (Model model) {
        return "index";
    }

    @GetMapping("/ellie")
    public String showEllie (Model model) {
        return "ellie";
    }

    @GetMapping("/admin/sofia")
    public String showAdminSofia (Model model) {
        return "admin/sofia";
    }
}
