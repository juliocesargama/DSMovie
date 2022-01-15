package br.com.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsmovie.entities.Score;
import br.com.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

    
}
