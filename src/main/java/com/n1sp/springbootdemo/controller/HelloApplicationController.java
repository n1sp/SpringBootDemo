package com.n1sp.springbootdemo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/helloWorld")
public class HelloApplicationController {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
