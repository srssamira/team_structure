package com.zup_players.team_structure.services.mappers;

import com.zup_players.team_structure.controllers.player.dtos.PlayerResponseDTO;
import com.zup_players.team_structure.controllers.team.dtos.TeamResponseDTO;
import com.zup_players.team_structure.models.Player;
import com.zup_players.team_structure.models.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamMapper {

    public static TeamResponseDTO toTeamResponseDTO(Team team) {
        TeamResponseDTO teamResponseDTO = new TeamResponseDTO();
        teamResponseDTO.setId(team.getId());
        teamResponseDTO.setName(team.getName());
        teamResponseDTO.setPlayers(toListPlayerResponseDTO(team.getPlayers()));
        return teamResponseDTO;
    }

    public static PlayerResponseDTO toPlayerResponseDTO(Player player) {
        PlayerResponseDTO playerResponseDTO = new PlayerResponseDTO();
        playerResponseDTO.setId(player.getId());
        playerResponseDTO.setName(player.getName());
        return playerResponseDTO;
    }

    public static List<PlayerResponseDTO> toListPlayerResponseDTO(List<Player> players) {
        List<PlayerResponseDTO> playerResponseDTOs = new ArrayList<>();
        for (Player player : players) {
            playerResponseDTOs.add(toPlayerResponseDTO(player));
        }
        return playerResponseDTOs;
    }
}
