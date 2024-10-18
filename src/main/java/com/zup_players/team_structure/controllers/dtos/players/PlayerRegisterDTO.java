package com.zup_players.team_structure.controllers.dtos.players;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerRegisterDTO {
    @NotNull
    @NotBlank
    private String name;

    public PlayerRegisterDTO() {
    }
}
