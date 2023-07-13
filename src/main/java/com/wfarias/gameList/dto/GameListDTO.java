package com.wfarias.gameList.dto;

import com.wfarias.gameList.entities.GameList;

public record GameListDTO (Long id,String name) {
	
	public GameListDTO(GameList game) {
		this(game.getId(),game.getName());
	}
}
