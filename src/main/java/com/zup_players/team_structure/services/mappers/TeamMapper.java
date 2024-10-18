package com.zup_players.team_structure.services.mappers;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.models.Team;


public class TeamMapper {

    public static Team fromTeamRegisterDTO (TeamRegisterDTO teamRegisterDTO) {
        Team team = new Team();
        team.setName(teamRegisterDTO.getName());
        team.setPlayers(PlayerMapper.fromPlayerRegisterDTO(teamRegisterDTO.getPlayers(), team));

        return team;
    }
}
