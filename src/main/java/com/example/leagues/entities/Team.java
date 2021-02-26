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
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String team;

}
