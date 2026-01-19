package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String hello(){
        return "home";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/basic")
    public String basic(){
        return "basic";
    }
}
