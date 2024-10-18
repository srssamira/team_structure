package com.zup_players.team_structure.services.mappers;

import com.zup_players.team_structure.controllers.dtos.players.PlayerRegisterDTO;
import com.zup_players.team_structure.models.Player;
import com.zup_players.team_structure.models.Team;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {

    public static List<Player> fromPlayerRegisterDTO(List<PlayerRegisterDTO> playerRegisterDTO, Team team) {
        List<Player> players = new ArrayList<Player>();
        for (PlayerRegisterDTO playerRegisterDTO1 : playerRegisterDTO) {
            Player player = new Player();
            player.setName(playerRegisterDTO1.getName());
            player.setTeam(team);
            players.add(player);
        }
        return players;
    }
}
