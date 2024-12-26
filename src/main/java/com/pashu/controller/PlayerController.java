package com.pashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pashu.model.Player;

import com.pashu.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService service;

	@PostMapping("/api/players")

	public String addPlayer(@RequestBody Player players) {

		return service.addPlayer(players);

	}

	@GetMapping("/api/players/all")

	public List<Player> getAllPlayer() {
		return service.getAllPlayer();

	}
	


}
