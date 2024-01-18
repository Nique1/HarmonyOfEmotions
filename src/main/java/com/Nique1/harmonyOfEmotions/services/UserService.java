package com.Nique1.harmonyOfEmotions.services;

import com.Nique1.harmonyOfEmotions.entities.User;
import com.Nique1.harmonyOfEmotions.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(User user){

        if(doesUserExists(user.getId())){
        throw new IllegalArgumentException("User already exists");
        }
        return userRepository.save(user);
    }
    public boolean doesUserExists(int userId){
        return userRepository.existsById(userId);
    }

}
