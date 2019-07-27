package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;

public interface SoccerService {

    public List<String> getAllTeamPlayers(long teamId);

    public void addBarcelonaPlayer(String name, String position, int number);

	public Team savePlayers();

}
