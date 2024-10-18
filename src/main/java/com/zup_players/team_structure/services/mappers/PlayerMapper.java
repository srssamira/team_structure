package com.zup_players.team_structure.services.mappers;

import com.zup_players.team_structure.controllers.dtos.players.PlayerRegisterDTO;
import com.zup_players.team_structure.controllers.dtos.players.PlayerResponseDTO;
import com.zup_players.team_structure.controllers.dtos.players.PlayerUpdateDTO;
import com.zup_players.team_structure.models.Player;
import com.zup_players.team_structure.models.Team;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {

    public static List<PlayerResponseDTO> fromPlayer(Team team) {
        List<PlayerResponseDTO> players = new ArrayList<>();
        for (Player player : team.getPlayers()) {
            PlayerResponseDTO playerDTO = new PlayerResponseDTO();
            playerDTO.setId(player.getId());
            playerDTO.setName(player.getName());
            players.add(playerDTO);
        }
        return players;
    }

    public static List<Player> fromPlayerRegisterDTO(List<PlayerRegisterDTO> playerRegisterDTO, Team team) {
        List<Player> players = new ArrayList<>();
        for (PlayerRegisterDTO playerRegisterDTO1 : playerRegisterDTO) {
            Player player = new Player();
            player.setName(playerRegisterDTO1.getName());
            player.setTeam(team);
            players.add(player);
        }
        return players;
    }

    public static List<Player> fromPlayerUpdateDTO(List<PlayerUpdateDTO> playerUpdateDTO, Team team) {
        List<Player> players = new ArrayList<>();
        for (PlayerUpdateDTO playerUpdateDTO1 : playerUpdateDTO) {
            Player player = new Player();
            player.setId(playerUpdateDTO1.getId());
            player.setName(playerUpdateDTO1.getName());
            player.setTeam(team);
            players.add(player);
        }
        return players;
    }
}
