package br.com.filmearchive.filmearchive.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


import org.springframework.stereotype.Service;

import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.Repository.ReviewsRepository;
import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Reviews;
import br.com.filmearchive.filmearchive.models.User;

@Service
public class ReviewService {

    private final ReviewsRepository repository;

    public ReviewService(ReviewsRepository repository) {
        this.repository = repository;
    }

    public Reviews registerOrUpdate(Reviews reviews) {
        return repository.save(reviews);
    }

    public Optional<Reviews> findById(UUID id) {
        return ReviewsRepository.findById(id);
    }

    public void remove(UUID id) {
        repository.deleteById(id);
    }

         public List<Reviews> findByUserId(User userId) {
        return repository.findByUserId(userId);
    }
}

