package dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class TournamentInfoDto {

    private String[] teamNames;
    private int rounds;


}
