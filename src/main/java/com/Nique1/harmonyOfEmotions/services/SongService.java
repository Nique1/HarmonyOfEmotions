package com.Nique1.harmonyOfEmotions.services;

import com.Nique1.harmonyOfEmotions.entities.Song;
import com.Nique1.harmonyOfEmotions.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    //CRUD


    public Song createSong(Song song){
        return songRepository.save(song);
    }






}
