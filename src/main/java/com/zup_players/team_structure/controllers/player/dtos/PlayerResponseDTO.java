package com.zup_players.team_structure.controllers.player.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerResponseDTO {
    private Long id;
    private String name;

    public PlayerResponseDTO() {
    }
}
