package com.example.leagues.services;

import dtos.TournamentInfoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TournamentService {

    public void GenerateFixtures(TournamentInfoDto dto){

        System.out.println("generating fixtures....");

        String[] teamNames = dto.getTeamNames();

        for(int i=0; i < teamNames.length-1; i++){
            for(int y=i+1; y < teamNames.length; y++){
                System.out.println(teamNames[i] + "-->" + teamNames[y]);
            }

        }
    }

}
