package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "This is the first line";
    }
    @GetMapping("/bye")
    public String bye(){
        return "Bye";
    }
    @GetMapping("/java")
    public String java(){
        return "Java";
    }
}
