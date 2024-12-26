package com.pashu.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pashu.model.Team;

@Repository
public class TeamdDao {

	List<Team> teams = new ArrayList<Team>();

	public String addNewTeam(Team team) {

		teams.add(team);
		return "added team....";

	}

	public List<Team> getAllTeam() {
		return teams;
	}

	public Team getTeamById(int id) {

		for (Team team : teams) {

			if (team.getTeamId() == id) {
				return team;
			}

		}
		return null;
	}

	public int deleteTeamById(int id) {

		for (Team team : teams) {

			if (team.getTeamId() == id) {
				teams.remove(team);
				return 1;
			}
		}
		return 0;

	}

	public int updateTeam(int id, Team team) {
		for (Team updateTeam : teams) {

			if (updateTeam.getTeamId() == id) {
				updateTeam.setName(team.getName());
				updateTeam.setCity(team.getCity());
				updateTeam.setCoach(team.getCoach());

				return 1;
			}

		}

		return 0;
	}

}
