package com.vistula.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Task1 is working ✅";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
}
