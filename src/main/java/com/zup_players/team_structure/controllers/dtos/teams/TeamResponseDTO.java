package com.zup_players.team_structure.controllers.dtos.teams;

import com.zup_players.team_structure.controllers.dtos.players.PlayerResponseDTO;
import com.zup_players.team_structure.models.Player;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
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
