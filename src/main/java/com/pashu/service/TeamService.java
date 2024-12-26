package com.pashu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pashu.dao.TeamdDao;
import com.pashu.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamdDao dao;

	public String addNewTeam(Team team) {

		String msg = dao.addNewTeam(team);
		return msg;

	}

	public List<Team> getAllTeam() {
		return dao.getAllTeam();

	}

	public Team getTeamById(int id) {
		Team team = dao.getTeamById(id);
		return team;
	}

	public String deletTeamById(int id) {
		int status = dao.deleteTeamById(id);

		if (status == 1) {
			return "Team deleted  ....";
		} else {
			return "Team not found for delete...";
		}

	}

	public String updateTeam(int id, Team team) {
		int status = dao.updateTeam(id, team);

		if (status == 0) {
			return " team doesnot update";
		} else {
			return " team is update";
		}

	}
}
