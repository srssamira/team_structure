package com.zup_players.team_structure.controllers.dtos.players;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlayerUpdateDTO {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String name;

    public PlayerUpdateDTO() {
    }
}
