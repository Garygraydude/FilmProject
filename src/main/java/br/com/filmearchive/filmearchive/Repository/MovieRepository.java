package br.com.filmearchive.filmearchive.Repository;


import java.util.List;
import java.util.Optional;

import br.com.filmearchive.filmearchive.models.Movie;


public interface MovieRepository extends JpaRepository<Movie, String> {
    public Optional<Movie> findByTitle(String title);

    public List<Movie> findAll();

    public Movie save(Movie movie);

    public Optional<Movie> findByGenre(String genre);

    public Optional<Movie> findByDirector(String director);

    public Optional<Movie> findbyReleaseYear(String releaseYear);
}