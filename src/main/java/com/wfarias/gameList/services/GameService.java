package com.wfarias.gameList.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfarias.gameList.dto.GameDTO;
import com.wfarias.gameList.entities.Game;
import com.wfarias.gameList.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<Game> findall(){
		var result = gameRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findbyId(Long id){
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
}
