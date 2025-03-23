package br.com.filmearchive.filmearchive.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, String> {
    public Optional<Reviews> findByUserId(User userId);

    public List<Reviews> findAll();
}
