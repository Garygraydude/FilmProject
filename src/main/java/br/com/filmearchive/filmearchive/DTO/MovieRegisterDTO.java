package br.com.filmearchive.filmearchive.DTO;


import java.util.ArrayList;
import java.util.List;

public class MovieRegisterDTO {

    private String title;
    private String genre;
    private String description;
    private String IMDB;
    private Short releaseYear;
    private String director;
    private short duration;


    // Im way in over my head with this one
    public MovieRegisterDTO() {
    }

    // full constructor
    public MovieRegisterDTO(String title, String genre, String description, String IMDB, Short releaseYear, String director,
            Short duration, List<String> review) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.IMDB = IMDB;
        this.releaseYear = releaseYear;
        this.director = director;
        this.duration = duration;
        
    }

    // getters and setters

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

    private String getIMDB() {
        return IMDB;
    }

    private void setIMDB() {
        this.IMDB = IMDB;
    }

    private Short getReleaseYear() {
        return releaseYear;
    }

    private void setReleaseYear() {
        this.releaseYear = releaseYear;
    }

    private String getDirector() {
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