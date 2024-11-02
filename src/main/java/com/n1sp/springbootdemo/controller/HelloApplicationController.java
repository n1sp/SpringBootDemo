package com.n1sp.springbootdemo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloApplicationController {
    @RequestMapping("/")
    public String test() {
        return "Hello World";
    }
}
