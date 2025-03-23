package br.com.filmearchive.filmearchive.Controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.Service.MovieService;
import br.com.filmearchive.filmearchive.models.Movie;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/contact")
@Tag(name = "Controlador de contatos", description = "Esse controlador tem como objetivo manipular os registros de contatos da nossa API")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Listagem de contatos", description = "Tem como objetivo listar todos os contatos cadastrados")
    public ResponseEntity<List<Object>> findAll() {
        List<Object> movie = service.findAll().stream().map(MovieDTO::toDTO).toList();
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<Object> register(@RequestBody MovieDTO movie) {
    Movie newMovie = service.registerOrUpdate(movie.toModel());
        if (newMovie.getId() != null) {
            return ResponseEntity.created(generateUri("movie", newMovie.getId()))
                    .body(MovieDTO.toDTO(newMovie));
        }
        return ResponseEntity.internalServerError().build();
    }



    private URI generateUri(String resource, Integer id) {
        String uriString = "http://localhost:8080/api/" + resource + "/" + id;
        return URI.create(uriString);
    }
}

    


