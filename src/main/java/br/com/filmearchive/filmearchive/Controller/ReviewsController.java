package br.com.filmearchive.filmearchive.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.DTO.ReviewsDTO;
import br.com.filmearchive.filmearchive.DTO.UsersDTO;
import br.com.filmearchive.filmearchive.Repository.ReviewsRepository;
import br.com.filmearchive.filmearchive.Repository.UserRepository;
import br.com.filmearchive.filmearchive.Service.MovieService;
import br.com.filmearchive.filmearchive.Service.ReviewService;
import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Reviews;
import br.com.filmearchive.filmearchive.models.User;

public class ReviewsController {
    private ReviewService service;
    @Autowired
    private ReviewService ReviewService;
    private MovieService MovieService;
    private br.com.filmearchive.filmearchive.Service.UserService UserService;

    public ReviewsController(ReviewService service, br.com.filmearchive.filmearchive.Service.UserService UserService,
            MovieService MovieService) {
        this.service = service;
    }

    @PostMapping
    public void register(@RequestBody ReviewsDTO Reviews) {
        Reviews newReviews = service.registerOrUpdate(Reviews.toModel());
    }

    @PutMapping
    public void edit(@RequestBody ReviewsDTO reviews) {
        Optional<Reviews> opt = service.findById(reviews.getId());
    }

    @Autowired
    private ReviewsRepository myEntityRepository;

    public boolean remove(UUID id) {
        Optional<Reviews> entity = ReviewsRepository.findById(id);

        if (entity.isPresent()) {
            ReviewsRepository.delete(entity.get());
            return true;
        }

        return false; // its 3AM right now....
    }

    @GetMapping("/Reviews")
    public ResponseEntity<List<ReviewsDTO>> findByAuthor(User author) {
        List<ReviewsDTO> ReviewsDTOs = UserService.findbyEmail(author);

        if (ReviewsDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(ReviewsDTOs);
    }
}
