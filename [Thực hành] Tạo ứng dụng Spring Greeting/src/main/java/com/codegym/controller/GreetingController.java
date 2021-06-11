package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String showGreeting(){
        ModelAndView modelAndView = new ModelAndView("index");
        return "index";
    }
    @GetMapping("/result")
    public String showResult(){
        return "result";
    }
}
