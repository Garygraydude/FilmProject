package br.com.filmearchive.filmearchive.DTO;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class ReviewRegisterDTO {
    private UUID id;

    private User userCpf;
    private String movieIMDB;
    private Byte rating;
    private String comment;
    private LocalDate date;

    public ReviewRegisterDTO() {
    }

    // Construtor inteiro
    public ReviewRegisterDTO(User userId, Long movieId, Byte rating, String comment, LocalDate date) {
        this.userCpf = userCpf;
        this.movieIMDB = movieIMDB;
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
        return userCpf;
    }

    public void setUserId(User userCpf) {
        this.userCpf = userCpf;
    }

    public String getMovieIMDB() {
        return movieIMDB;
    }

    public void setMovieId(String movieIMDB) {
        this.movieIMDB = movieIMDB;
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
