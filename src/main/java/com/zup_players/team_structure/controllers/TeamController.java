package com.zup_players.team_structure.controllers;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamUpdateDTO;
import com.zup_players.team_structure.models.Team;
import com.zup_players.team_structure.services.TeamService;
import com.zup_players.team_structure.services.mappers.TeamMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Team createTeam(@RequestBody @Valid TeamRegisterDTO teamRegisterDTO) {
        return teamService.saveTeam(teamRegisterDTO);
    }

    @GetMapping("/{teamId}")
    public TeamResponseDTO getTeamById(@PathVariable Long teamId) {
        return teamService.findTeamById(teamId);
    }

    @PutMapping
    public Team updateTeam(@RequestBody @Valid TeamUpdateDTO teamUpdateDTO) {
        return teamService.updateTeam(TeamMapper.fromTeamUpdateDTO(teamUpdateDTO));
    }

    @DeleteMapping("/{teamId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeam(@PathVariable Long teamId) {
        teamService.deleteTeam(teamId);
    }

}
