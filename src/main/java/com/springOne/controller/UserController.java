package com.springOne.controller;

import com.springOne.entity.User;
import com.springOne.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @PostConstruct // to run every time the server starts
//    public void initRolesandUsers() {
//        userService.initRolesAndUser();
//    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
       return userService.registerNewUser(user);
    }
}
