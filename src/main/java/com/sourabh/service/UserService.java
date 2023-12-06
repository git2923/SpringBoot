package com.sourabh.service;

import com.sourabh.entities.User;
import com.sourabh.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser(){
        Iterable<User> all = userRepo.findAll();
        List<User> list = new ArrayList<>();

        for (User user : all) {
            list.add(user);
        }
        return list;
    }


    public Optional<User> getSingle(int id) {
        Optional<User> obj =  userRepo.findById(id);
        System.out.println("Inside userservice "+obj);

        return obj;

    }

}
