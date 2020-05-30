package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/demo")
public class DemoApplicationController {
    @GetMapping("/sample1")
    public String demo(){
        return "text";
    }
    public DemoApplicationController(){
    }

    @GetMapping("/sample2")
    public Integer get(@RequestParam("number1") int number1,@RequestParam("number2") int number2){
        return number1*number2;
    }

    @GetMapping("/+")
    public Integer addition(@RequestParam("number1") int number1,@RequestParam("number2") int number2){
        return number1+number2;
    }

    @GetMapping("/-")
    public Integer subtraction(@RequestParam("number1") int number1,@RequestParam("number2") int number2){
        return number1-number2;
    }

    @GetMapping("/*")
    public Integer multiplication(@RequestParam("number1") int number1,@RequestParam("number2") int number2){
        return number1*number2;
    }

    @GetMapping("//")
    public Integer division(@RequestParam("number1") int number1,@RequestParam("number2") int number2){
        return number1/number2;
    }

    @GetMapping("/computation")
    public Integer computation(@RequestParam("num1") int num1,@RequestParam("num2") int num2, @RequestParam("symbol") String symbol){
        if (symbol.equals("tasu")){
            return num1+num2;
        }
        if (symbol.equals("hiku")){
            return num1-num2;
        }
        if (symbol.equals("kakeru")){
            return num1*num2;
        }
        if (symbol.equals("waru")){
            return num1/num2;
        }
        throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);

    }



}
