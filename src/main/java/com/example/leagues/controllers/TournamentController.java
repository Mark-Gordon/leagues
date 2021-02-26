package com.example.leagues.controllers;

import com.example.leagues.entities.Fixture;
import com.example.leagues.services.TournamentService;
import dtos.TournamentInfoDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "tournament")
@AllArgsConstructor
public class TournamentController {

    @Autowired
    private final TournamentService tournamentService;


    @PostMapping
    public String postTournamentInfo(@RequestBody TournamentInfoDto dto){

        List<Fixture> fixtures;

        tournamentService.GenerateFixtures(dto);
        return "hello";

    }


}
