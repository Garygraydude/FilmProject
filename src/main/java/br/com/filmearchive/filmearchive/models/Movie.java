package br.com.filmearchive.filmearchive.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
  @Column(length = 150, nullable = false)
  private String title;
    @Column(length = 150, nullable = false)
    private String genre;
    @Column(length = 150, nullable = false)
    private String description;
    @Column(length = 150, nullable = false)
    private String IMDB;
    @Column(length = 150, nullable = false)
    private Short releaseYear;
    @Column(length = 4, nullable = false)
    private String director;
    @Column(length = 150, nullable = false)
    private short duration;
    @Column(length = 150, nullable = false)
    List<String> review = new ArrayList<>();
    
  
    // Empty constructor for reasons that i presently don't remember

    // full constructor
    public Movie(String title, String genre, String description, String IMDB, Short releaseYear, String director,
            Short duration, List<String> review) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.IMDB = IMDB;
        this.releaseYear = releaseYear;
        this.director = director;
        this.duration = duration;
        this.review = review;

  
    
    }
@OneToMany(mappedBy = "Movie", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Reviews> reviews;
    
    // getters and setters (did them early so i don't fucking forget them)
    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String gettitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getgenre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }

    public String getIMDB() {
        return IMDB;
    }

    private void setIMDB() {
        this.IMDB = IMDB;
    }

    public Short getReleaseYear() {
        return releaseYear;
    }

    private void setReleaseYear() {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector() {
        this.director = director;
    }

    private Short getDuration() {
        return duration;
    }

    private void setDuration() {
        this.duration = duration;
    }

    
}
