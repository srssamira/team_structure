package com.zup_players.team_structure.services.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.models.Team;


public class TeamMapper {

    public static Team fromTeamRegisterDTO (TeamRegisterDTO teamRegisterDTO) {
        Team team = new Team();
        team.setName(teamRegisterDTO.getName());
        team.setPlayers(PlayerMapper.fromPlayerRegisterDTO(teamRegisterDTO.getPlayers(), team));

        return team;
    }

    public static TeamResponseDTO fromTeam (Team team) {
        TeamResponseDTO teamResponseDTO = new TeamResponseDTO();
        teamResponseDTO.setName(team.getName());
        teamResponseDTO.setPlayers(PlayerMapper.fromPlayer(team));
        return teamResponseDTO;
    }
}
