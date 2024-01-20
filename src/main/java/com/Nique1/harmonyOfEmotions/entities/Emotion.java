package com.Nique1.harmonyOfEmotions.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emotion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String emotionName;

    @OneToMany(mappedBy = "emotion")
    private List<Song> songs;


}
