package com.wfarias.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wfarias.gameList.dto.GameDTO;
import com.wfarias.gameList.dto.GameMinDTO;
import com.wfarias.gameList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findall();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		return gameService.findbyId(id);
	}
	

}
