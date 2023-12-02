package com.sourabh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("This is home page");
        return "home";
    }

}
