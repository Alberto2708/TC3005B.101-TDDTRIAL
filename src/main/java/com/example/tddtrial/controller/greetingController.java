package com.example.tddtrial.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class greetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/greetingwithname")
    public String greetingWithName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
    

}
