package com.malachit.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellojenkinsApplication {

    @GetMapping
    public String hello(){
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellojenkinsApplication.class, args);
    }

}

