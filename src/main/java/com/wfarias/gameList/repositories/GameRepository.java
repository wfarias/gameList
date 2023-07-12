package com.wfarias.gameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfarias.gameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
