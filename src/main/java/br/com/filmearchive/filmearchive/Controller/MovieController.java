package br.com.filmearchive.filmearchive.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.MovieService;
import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.models.Movie;

@RestController
@RequestMapping
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }
}
    


