package com.example.d01.controller;

import com.example.d01.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){

        User u1 = new User(19, "女", "cyw",20);
        User u2 = new User(29, "女", "yyl",20);
        User u3 = new User(03, "男", "gxt",20);
        List<User> userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        return userList;
    }
}
