package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	@Transactional
	List<Player> findByTeamId(long teamId);

	@Transactional
	Team save(Team team);
}