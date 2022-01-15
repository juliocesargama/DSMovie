package br.com.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dsmovie.dto.MovieDTO;
import br.com.dsmovie.dto.ScoreDTO;
import br.com.dsmovie.entities.User;
import br.com.dsmovie.entities.Movie;
import br.com.dsmovie.entities.Score;
import br.com.dsmovie.repositories.MovieRepository;
import br.com.dsmovie.repositories.ScoreRepository;
import br.com.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){

        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        //Atualiza a média do filme
        double sum = 0.0;
        for (Score s: movie.getScores()){
            sum += s.getValue();
        }

        double avg = sum / movie.getScores().size();

        //Atualiza os valores no filme classificado pelo usuário
        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);

    }
    
}
