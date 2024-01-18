package com.Nique1.harmonyOfEmotions.repositories;

import com.Nique1.harmonyOfEmotions.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
