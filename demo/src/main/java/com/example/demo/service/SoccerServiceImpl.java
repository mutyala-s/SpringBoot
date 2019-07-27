package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {

	@Autowired

	private PlayerRepository playerRepository;

	@Autowired

	private TeamRepository teamRepository;

	public List<String> getAllTeamPlayers(long teamId) {

		List<String> result = new ArrayList<String>();

		List<Player> players = playerRepository.findByTeamId(teamId);

		for (Player player : players) {

			result.add(player.getName());

		}

		return result;

	}
	public Team savePlayers() {
		Team team =new Team();
		//team.setId(2l);
		team.setName("footBal");
		List<Player> list = new ArrayList<>();
		list.add(new Player("AAA", 123, "Forward",team));
		list.add(new Player("BBB", 456, "Midfielder",team));
		team.setPlayers(list);
		Team teamSaved = teamRepository.save(team);
		return teamSaved ;
	}

	public void addBarcelonaPlayer(String name, String position, int number) {

		Optional<Team> barcelona = teamRepository.findById(1l);

		Player newPlayer = new Player();

		newPlayer.setName(name);

		newPlayer.setPosition(position);

		newPlayer.setNum(number);

		newPlayer.setTeam(barcelona.get());

		//playerRepository.save(newPlayer);

	}

}
