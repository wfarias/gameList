package com.wfarias.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfarias.gameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
