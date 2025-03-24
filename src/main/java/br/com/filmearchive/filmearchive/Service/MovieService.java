package br.com.filmearchive.filmearchive.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.models.Movie;

@Service
public class MovieService {
    private final  MovieRepository repository;
    
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
            return MovieRepository.findById(id);
        }
    
        public List<MovieDTO> findByTitle(String title) {
            return repository.findByTitle(title);
    }

    public Optional<Movie> findbyGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public List<MovieDTO> findbyDirector(String director) {
        return repository.findByDirector(director);
    }

    public List<MovieDTO> findbyReleaseYear(String releaseYear) {
        return repository.findbyReleaseYear(releaseYear);

    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Movie> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public List<MovieDTO> findByGenre(String genre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByGenre'");
    }
}
