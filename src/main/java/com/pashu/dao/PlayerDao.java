package com.pashu.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.pashu.model.Player;

@Repository
public class PlayerDao {

	List<Player> playerList = new ArrayList<Player>();

	public String addPlayer(@RequestBody Player players) {

		playerList.add(players);
		return " Player Added Successfully.. ";

	}

	public List<Player> getAllPlayer() {
		return playerList;
	}

	public Player getPlayerById(int id) {

		for (Player player : playerList) {

			if (player.getPlayerId() == id) {
				return player;
			}

		}

		return null;

	}

	public String deletePlayerById(@RequestParam int id) {

		for (Player player : playerList) {

			if (player.getPlayerId() == id) {
				playerList.remove(player);

				return "Player delete Succefullly...";
			}

		}

		return "Player not found....";

	}

	public String updatePlayerById(int id, Player player) {
		
		
		for (Player updatePlayer : playerList) {
			
			if(player.getPlayerId()==id)
			{
				updatePlayer.setName(player.getName());
				updatePlayer.setAge(player.getAge());
				updatePlayer.setTeamId(player.getTeamId());
				updatePlayer.setRole(player.getRole());
				return "Player Update...";
			}
			
		}
		return " player not found...";
	}
}