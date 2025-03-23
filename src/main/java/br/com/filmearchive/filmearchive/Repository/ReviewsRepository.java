package br.com.filmearchive.filmearchive.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, String> {
    public Optional<Reviews> findByUserId(UUID id);

    public List<Reviews> findAll();

    public Reviews save(Reviews reviews);

    public void deleteById(UUID id);

    public Optional<Reviews> findById(UUID id);

    public List<Reviews> findByUserId(org.apache.catalina.User userId);
}
