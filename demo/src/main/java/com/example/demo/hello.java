package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;

@RestController
public class hello {
    @GetMapping("/")
    public String Hello(){
        return "This is the first line";
    }
    @GetMapping("/bye")
    public String Bye(){
        return "Bye";
    }
    @GetMapping("/java")
    public String Java(){
        return "Java";
    }
}
