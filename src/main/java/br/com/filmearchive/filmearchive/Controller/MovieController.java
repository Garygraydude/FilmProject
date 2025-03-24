package br.com.filmearchive.filmearchive.Controller;

import java.net.URI;
import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.Service.MovieService;
import br.com.filmearchive.filmearchive.models.Movie;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class MovieController {

    private MovieService service;
    @Autowired
    private MovieService MovieService;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @PostMapping
    public void register(@RequestBody MovieDTO movie) {
        Movie newMovie = service.registerOrUpdate(movie.toModel());
    }

    @PutMapping
    public void edit(@RequestBody MovieDTO movie) {
        Optional<Movie> opt = service.findById(movie.getId());
    }

    public List<Movie> findAll() {
        return MovieDTO.findAll();
    }

    @GetMapping("/Movie/{id}")
    public ResponseEntity<?> findById(@PathVariable UUID id) {
        Optional<Movie> entityOptional = MovieRepository.findById(id);

        if (entityOptional.isPresent()) {
            return ResponseEntity.ok(entityOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entidade nao encontrada");
        }
    }

    @Autowired
    private MovieRepository myEntityRepository;

    public boolean remove(UUID id) {
        Optional<Movie> entity = MovieRepository.findById(id);

        if (entity.isPresent()) {
            MovieRepository.delete(entity.get());
            return true;
        }

        return false; // i want sleep now....
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findByTitle(String title) {
        List<MovieDTO> MovieDTOs = MovieService.findByTitle(title);

        if (MovieDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(MovieDTOs);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findByReleaseYear(String releaseYear) {
        List<MovieDTO> MovieDTOs = MovieService.findbyReleaseYear(releaseYear);

        if (MovieDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(MovieDTOs);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findByDirector(String name) {
        List<MovieDTO> MovieDTOs = MovieService.findbyDirector(name);

        if (MovieDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(MovieDTOs);
    }

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> findByGenre(String genre) {
        List<MovieDTO> MovieDTOs = MovieService.findByGenre(genre);

        if (MovieDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(MovieDTOs);
    }


}
