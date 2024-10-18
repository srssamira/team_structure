package com.zup_players.team_structure.services;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.models.Team;
import com.zup_players.team_structure.repositories.TeamRepository;
import com.zup_players.team_structure.services.mappers.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team saveTeam(TeamRegisterDTO teamRegisterDTO) {
        return teamRepository.save(TeamMapper.fromTeamRegisterDTO(teamRegisterDTO));
    }

    public TeamResponseDTO findTeamById(Long id) {
        Optional<Team> teamOptional = teamRepository.findById(id);
        if (teamOptional.isPresent()) {
            return TeamMapper.fromTeam(teamOptional.get());
        } else {
            throw new RuntimeException("team doesn't exist");
        }
    }
}
