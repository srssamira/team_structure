package com.zup_players.team_structure.services.mappers;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamUpdateDTO;
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
        teamResponseDTO.setId(team.getId());
        teamResponseDTO.setName(team.getName());
        teamResponseDTO.setPlayers(PlayerMapper.fromPlayer(team));
        return teamResponseDTO;
    }

    public static Team fromTeamUpdateDTO (TeamUpdateDTO teamUpdateDTO) {
        Team team = new Team();
        team.setName(teamUpdateDTO.getName());
        team.setId(teamUpdateDTO.getId());
        team.setPlayers(PlayerMapper.fromPlayerUpdateDTO(teamUpdateDTO.getPlayers(), team));
        return team;
    }
}
