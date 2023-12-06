package com.sourabh.controller;

import com.sourabh.entities.User;
import com.sourabh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getSingleUser(@PathVariable("id") int id){
        System.out.println("Inside controller");
        return userService.getSingle(id);
    }

}
