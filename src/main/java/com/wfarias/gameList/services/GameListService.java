package com.wfarias.gameList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfarias.gameList.dto.GameListDTO;
import com.wfarias.gameList.entities.GameList;
import com.wfarias.gameList.projection.GameMinProjection;
import com.wfarias.gameList.repositories.GameListRepository;
import com.wfarias.gameList.repositories.GameRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findall(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex){
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		var min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		var max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++ ) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
	
}
