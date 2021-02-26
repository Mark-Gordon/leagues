package com.example.leagues.fixture;

import com.example.leagues.entities.Fixture;
import com.example.leagues.repositories.FixtureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FixtureConfig {
    @Bean
    CommandLineRunner commandLineRunner(FixtureRepository repository){
        System.out.println("hello\n\n\n\n\n\n");
        return args -> {
            Fixture mark = (new Fixture(1, "Celtic", "Rangers"));
            repository.save(mark);
        };
    }
}
