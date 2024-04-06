package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DemoController {

    @GetMapping("/page")
    public String welcomeString() {
        return "Welcome to Demo Project Sandeep ANdhale";
    }
}
