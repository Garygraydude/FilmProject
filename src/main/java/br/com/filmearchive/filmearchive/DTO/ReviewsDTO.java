package br.com.filmearchive.filmearchive.DTO;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import br.com.filmearchive.filmearchive.models.Reviews;

public class ReviewsDTO {
 private UUID id;

    private User Author;
    private Long movieId;
    private Byte rating;
    private String comment;
    private LocalDate date;

    public ReviewsDTO(){}
//Construtor inteiro
    public ReviewsDTO(User userId, Long movieId, Byte rating, String comment, LocalDate date) {
        this.Author = userId;
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
        return Author;
    }

    public void setUserId(User userId) {
        this.Author = userId;
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
    public Reviews toModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toModel'");
    }

}
