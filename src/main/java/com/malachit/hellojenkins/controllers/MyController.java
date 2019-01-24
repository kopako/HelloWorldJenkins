package com.malachit.hellojenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String hello(){
        System.out.println("dummy change");
        return "Hello world";
      
    }
}
