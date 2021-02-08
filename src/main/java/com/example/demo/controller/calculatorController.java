package com.example.demo.controller;

import com.example.demo.controller.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class calculatorController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("calculator",new Calculator());
        return "sample";
    }

    @RequestMapping(value = "/result" , method = RequestMethod.POST)
    public String calculatorSubmit(@ModelAttribute Calculator calculator , Model model) {
        long sum = calculator.getNumber1() + calculator.getNumber2();

        model.addAttribute("calculator", sum);
        return "result";
    }
}
