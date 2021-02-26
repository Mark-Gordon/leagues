package com.example.leagues.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Fixture {

    public Fixture(int gameWeek, String homeTeam, String awayTeam){
        this.gameWeek = gameWeek;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int gameWeek;
    private String homeTeam;
    private String awayTeam;


}
