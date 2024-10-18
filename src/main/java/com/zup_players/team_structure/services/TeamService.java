package com.zup_players.team_structure.services;
import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.models.Team;

public interface TeamService {
    Team saveTeam(TeamRegisterDTO teamRegisterDTO);
}
