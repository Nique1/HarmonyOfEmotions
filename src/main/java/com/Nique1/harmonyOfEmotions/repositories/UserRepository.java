package com.Nique1.harmonyOfEmotions.repositories;

import com.Nique1.harmonyOfEmotions.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
