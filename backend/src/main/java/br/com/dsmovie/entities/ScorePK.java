package br.com.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


//Classe que representa a chave composta da tabela score
@Embeddable
public class ScorePK implements Serializable {

    //Chave Estrangeira
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    //Chave Estrangeira
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public ScorePK() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    
}
