package com.wfarias.gameList.dto;

import org.springframework.beans.BeanUtils;
import com.wfarias.gameList.entities.Game;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameDTO{
		 private Long id;
		 private String title;
		 private Integer year;
		 private String genre;
		 private String platforms;
		 private Double score;
		 private String imgUrl;
		 private String shortDescription;
		 private String longDescription;
	
    public GameDTO () {
    }
    
	public GameDTO (Game game){
		BeanUtils.copyProperties(game, this);
	}

}
