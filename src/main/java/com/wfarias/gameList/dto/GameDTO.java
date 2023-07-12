package com.wfarias.gameList.dto;

public record GameDTO(
		 Long id,
		 String title,
		 Integer year,
		 String genre,
		 String platforms,
		 Double score,
		 String imgUrl,
		 String shortDescription,
		 String longDescription) {

}
