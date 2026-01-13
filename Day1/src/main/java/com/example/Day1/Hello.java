package com.example.Day1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World.";
    }
    @GetMapping("/first")
    public String first() {
        return "This is First Line.";
    }
    @GetMapping("/name")
    public String name() {
        return "My name is Aditya.";
    }
}
