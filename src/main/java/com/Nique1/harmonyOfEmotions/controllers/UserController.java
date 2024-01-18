package com.Nique1.harmonyOfEmotions.controllers;

import com.Nique1.harmonyOfEmotions.entities.User;
import com.Nique1.harmonyOfEmotions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
    return userService.createUser(user);
    }
}
