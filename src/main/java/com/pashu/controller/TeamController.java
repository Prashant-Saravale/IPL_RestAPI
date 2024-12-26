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

import com.pashu.model.Team;
import com.pashu.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService service;

	@PostMapping("/api/teams/")
	public String addNewTeam(@RequestBody Team team) {

		return service.addNewTeam(team);

	}

	@GetMapping("/api/teams/all")

	public List<Team> getAllTeam() {
		return service.getAllTeam();

	}

	@GetMapping("api/teams")

	public Object getTeamById(@RequestParam int id) {
		Team team = service.getTeamById(id);

		if (team != null) {
			return team;
		} else {
			return "Team not found";
		}

	}

	@DeleteMapping("api/teams/{id}")

	public String deleteTeamById(@PathVariable int id) {

		return service.deletTeamById(id);

	}

	@PutMapping("/api/teams/{id}")

	public String updateTeam(@PathVariable int id, @RequestBody Team team) {
		return service.updateTeam(id, team);
	}

}
