package com.springmasterclass.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${welcome.message.config}")
    private String welcomeMessage;

    @GetMapping(value = "/")
    public String helloworld(){
        return welcomeMessage;
    }
}
