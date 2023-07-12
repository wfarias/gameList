package com.wfarias.gameList.dto;

import com.wfarias.gameList.entities.Game;

public record GameMinDTO(Long id,String title, Integer year, String imgUrl,  String shortDescription) {
	
	public GameMinDTO(Game game){
		this(game.getId(),game.getTitle(),game.getYear(),game.getImgUrl(),game.getShortDescription());
	}
	
}
