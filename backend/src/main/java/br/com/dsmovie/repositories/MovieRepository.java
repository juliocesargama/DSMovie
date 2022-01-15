package br.com.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

