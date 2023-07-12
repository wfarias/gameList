package com.wfarias.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfarias.gameList.entities.Game;
import com.wfarias.gameList.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findall(){
		var result = gameRepository.findAll();
		return result;
	}
}
