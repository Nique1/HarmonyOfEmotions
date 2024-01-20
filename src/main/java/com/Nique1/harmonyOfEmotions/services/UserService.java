package com.Nique1.harmonyOfEmotions.services;

import com.Nique1.harmonyOfEmotions.entities.User;
import com.Nique1.harmonyOfEmotions.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Create - POST
    public User createUser(User user){
        return userRepository.save(user);
    }

    //Read - GET
    public User getUserById(int userId){
        return userRepository.findById(userId).orElse(null);
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //Update - PUT AND PATCH

    public User updateUser(User user){
        User exisitngUser = userRepository.findById(user.getId()).orElse(null);
        if (exisitngUser != null) {
            exisitngUser.setUsername(user.getUsername());
        }
        return userRepository.save(exisitngUser);
    }
    //Delete - DELETE
    public String deleteUserById(int userId){
        userRepository.deleteById(userId);
        return "user with id: " +  userId + " deleted";
    }

    public String deleteAllUsers(){
        userRepository.deleteAll();
        return "all users deleted ";
    }



}
