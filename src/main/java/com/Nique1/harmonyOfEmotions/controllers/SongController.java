package com.Nique1.harmonyOfEmotions.controllers;

import com.Nique1.harmonyOfEmotions.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
    @Autowired
    private SongService songService;


}
