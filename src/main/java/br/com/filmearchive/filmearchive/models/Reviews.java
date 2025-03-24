package br.com.filmearchive.filmearchive.models;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UUID id;
@Column(length = 150, nullable = false)
private User Author;
    @Column(length = 150, nullable = false)
    private Long movieId;
    @Column(length = 150, nullable = false)
    private Byte rating;
    @Column(length = 150, nullable = false)
    private String comment;
    @Column(length = 150, nullable = false)
    private LocalDate date;
    
//i had just remembered why i needed these but i kinda forgot already
    public Reviews(){}
//full constructor
public Reviews(User userId, Long movieId, Byte rating, String comment, LocalDate date) {
    this.Author = userId;
    this.movieId = movieId;
    this.rating = rating;
    this.comment = comment;
    this.date = date;
}
    
@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "movie_id", nullable = false)
private Movie movie;

@ManyToOne(cascade = CascadeType.MERGE)
@JoinColumn(name = "User_cpf", nullable = false)
    
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

}
