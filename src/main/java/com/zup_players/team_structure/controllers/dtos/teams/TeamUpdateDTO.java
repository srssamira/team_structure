package com.zup_players.team_structure.controllers.dtos.teams;

import com.zup_players.team_structure.controllers.dtos.players.PlayerUpdateDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamUpdateDTO {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 5)
    private List<PlayerUpdateDTO> players;

    public TeamUpdateDTO() {
    }
}
