package com.cbct.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class DashboardController {
    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
}
