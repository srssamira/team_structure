package com.zup_players.team_structure.controllers.dtos.teams;

import com.zup_players.team_structure.controllers.dtos.players.PlayerResponseDTO;
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
