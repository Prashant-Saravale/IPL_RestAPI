package com.pashu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.pashu.dao.PlayerDao;
import com.pashu.model.Player;

@Service

public class PlayerService {

	@Autowired
	private PlayerDao dao;

	public String addPlayer(@RequestBody Player players) {

		String msg = dao.addPlayer(players);
		return msg;

	}

	public List<Player> getAllPlayer() {
		return dao.getAllPlayer();

	}
}
