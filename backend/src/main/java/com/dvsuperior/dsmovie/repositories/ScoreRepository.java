package com.dvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie.entities.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
