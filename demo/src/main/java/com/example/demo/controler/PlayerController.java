package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SoccerService;

@RestController
public class PlayerController {
	@Autowired
	SoccerService soccerService;
	
	
	@RequestMapping(value = "/demo/hello2", method = RequestMethod.GET, consumes = { "text/plain",
	"application/*" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getAllPlayers() {

		List<String> players = soccerService.getAllTeamPlayers(1);
		//Team team = soccerService.savePlayers();
        return new ResponseEntity<List<String>>(players, HttpStatus.OK);
        
    }
	
}
