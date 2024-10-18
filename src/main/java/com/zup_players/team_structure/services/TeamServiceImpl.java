package com.zup_players.team_structure.services;

import com.zup_players.team_structure.controllers.dtos.teams.TeamRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.teams.TeamResponseDTO;
import com.zup_players.team_structure.models.Player;
import com.zup_players.team_structure.models.Team;
import com.zup_players.team_structure.repositories.TeamRepository;
import com.zup_players.team_structure.services.mappers.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    private Team findTeam(Long id){
        Optional<Team> teamOptional = teamRepository.findById(id);
        return teamOptional.orElseThrow(() -> new RuntimeException("team not found"));
    }

    public Team updateTeam(Team team) {
        Team teamData = findTeam(team.getId());

        if (!teamData.getName().equalsIgnoreCase(team.getName()))
            teamData.setName(team.getName());

        List<Player> teamDataPlayers = teamData.getPlayers();
        List<Player> teamPlayers = team.getPlayers();

        if (teamDataPlayers.size() != teamPlayers.size()) {
            teamData.setPlayers(teamPlayers);
        } else {
            for (int index = 0; index < teamDataPlayers.size(); index++) {
                Player equalPlayer = teamDataPlayers.get(index);
                Player newPlayer = teamPlayers.get(index);

                if (equalPlayer.getId() != newPlayer.getId()
                        || !equalPlayer.getName().equalsIgnoreCase(newPlayer.getName())) {
                    teamDataPlayers.set(index, teamDataPlayers.get(index));
                    break;
                }
            }

        }
        return teamRepository.save(teamData);
    }
}
