package com.zup_players.team_structure.controllers.team.dtos;

import com.zup_players.team_structure.controllers.player.dtos.PlayerResponseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamResponseDTO {
    private Long id;
    private String name;
    private List<PlayerResponseDTO> players;

    public TeamResponseDTO() {
    }
}
