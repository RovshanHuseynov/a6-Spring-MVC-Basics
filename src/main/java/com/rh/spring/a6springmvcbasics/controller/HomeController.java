package com.rh.spring.a6springmvcbasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String showMyPage(){
        System.out.println("googgooo goo");
        return "main-menu";
    }
}
