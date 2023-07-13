package com.wfarias.gameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wfarias.gameList.dto.GameListDTO;
import com.wfarias.gameList.dto.GameMinDTO;
import com.wfarias.gameList.entities.Game;
import com.wfarias.gameList.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		var result = gameListService.findall();
		return  result;
	}

}
