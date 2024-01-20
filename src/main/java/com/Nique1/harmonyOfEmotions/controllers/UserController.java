package com.Nique1.harmonyOfEmotions.controllers;

import com.Nique1.harmonyOfEmotions.entities.User;
import com.Nique1.harmonyOfEmotions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
    return userService.createUser(user);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex){
        return ResponseEntity.badRequest().body("Validation error: " + ex.getFieldError());
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam int userId){
        return userService.getUserById(userId);
    }

    @GetMapping("/getUserByUsername/{username}")
    public User getUserByUsername(@PathVariable String username){
        return userService.getUserByUsername(username);
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUserById/{userId}")
    public String deleteUserById(@PathVariable int userId){
        return userService.deleteUserById(userId);
    }

    @DeleteMapping("/deleteAllUsers")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }


}
