package br.com.filmearchive.filmearchive.models;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class Reviews {

    private UUID id;

    private User userId;
    private Long movieId;
    private Byte rating;
    private String comment;
    private LocalDate date;
//i had just remembered why i needed these but i kinda forgot already
    public Reviews(){}
//full constructor
    public Reviews(User userId, Long movieId, Byte rating, String comment, LocalDate date) {
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Byte getRating() {
        return rating;
    }

    public void setRating() {
        this.rating = rating;
    }

    private String getComment() {
        return comment;
    }

    private void setComment() {
        this.comment = comment;
    }

    private LocalDate getDate() {
        return date;
    }

    private void setDate() {
        this.date = date;
    }

}
