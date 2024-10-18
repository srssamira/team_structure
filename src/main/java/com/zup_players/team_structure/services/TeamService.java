package com.zup_players.team_structure.services;
import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamUpdateDTO;
import com.zup_players.team_structure.models.Team;

public interface TeamService {
    Team saveTeam(TeamRegisterDTO teamRegisterDTO);

    TeamResponseDTO findTeamById(Long teamId);

    Team updateTeam(Team team);

    void deleteTeam(Long teamId);
}
