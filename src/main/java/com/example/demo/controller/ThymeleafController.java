package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class ThymeleafController {
    @GetMapping("/doom")
    public String sample(Model apex){
        apex.addAttribute("roba","Roba!");
        return "sample";
    }

    @GetMapping("/eva")
    public  String anime(Model nerv){
        nerv.addAttribute("syogouki","sinzi");
        return "sample";
    }

    @GetMapping("/demo")
    public String demo(){
        return "sample";
    }
}
