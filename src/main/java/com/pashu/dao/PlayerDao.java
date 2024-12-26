package com.pashu.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	
}