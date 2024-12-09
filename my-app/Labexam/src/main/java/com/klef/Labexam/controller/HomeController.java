package com.klef.Labexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getWelcomeMessage() {
        return "Welcome to the Order Management System";
    }
} 