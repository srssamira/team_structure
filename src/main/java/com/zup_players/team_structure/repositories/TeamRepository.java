package com.zup_players.team_structure.repositories;

import com.zup_players.team_structure.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
