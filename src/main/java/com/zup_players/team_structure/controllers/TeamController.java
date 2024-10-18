package com.zup_players.team_structure.controllers;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.models.Team;
import com.zup_players.team_structure.services.TeamService;
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

}
