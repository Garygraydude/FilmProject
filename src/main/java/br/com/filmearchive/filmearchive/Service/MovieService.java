package br.com.filmearchive.filmearchive.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.models.Movie;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> findAll() {
        return repository.findAll();
    }

    public Movie registerOrUpdate(Movie movie) {
        return repository.save(movie);
    }

    public Optional<Movie> findById(UUID id) {
        return repository.findById(id);
    }

    public Optional<Movie> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    public Optional<Movie> findbyGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public Optional<Movie> findbyDirector(String director) {
        return repository.findByDirector(director);
    }

    public Optional<Movie> findbyReleaseYear(String releaseYear) {
        return repository.findbyReleaseYear(releaseYear);

    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
