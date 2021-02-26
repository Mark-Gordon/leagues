package com.example.leagues.models;

import com.example.leagues.entities.Fixture;
import com.example.leagues.entities.Team;
import com.example.leagues.entities.Team;

import java.util.List;

public class Tournament {

    private long id;
    private String name;
    private int rounds;
    private String winner;
    private List<Team> teams;
    private List<Fixture> fixtures;

}
