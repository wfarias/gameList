package com.wfarias.gameList.dto;

import com.wfarias.gameList.entities.Game;
import com.wfarias.gameList.projection.GameMinProjection;

public record GameMinDTO(Long id,String title, Integer year, String imgUrl,  String shortDescription) {
	
	public GameMinDTO(Game game){
		this(game.getId(),game.getTitle(),game.getYear(),game.getImgUrl(),game.getShortDescription());
	}
	
	public GameMinDTO(GameMinProjection projection){
		this(projection.getId(),projection.getTitle(),projection.getYear(),
			 projection.getImgUrl(),projection.getShortDescription());
	}
	
}
