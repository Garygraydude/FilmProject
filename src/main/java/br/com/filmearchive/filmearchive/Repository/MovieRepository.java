package br.com.filmearchive.filmearchive.Repository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.com.filmearchive.filmearchive.models.Movie;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public interface MovieRepository extends JpaRepository<Movie, String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    public Optional<Movie> findByTitle(String title);

    @Column
    public List<Movie> findAll();

    @Column
    public Movie save(Movie movie);

    @Column
    public Optional<Movie> findByGenre(String genre);

    @Column
    public Optional<Movie> findByDirector(String director);

    @Column
    public Optional<Movie> findbyReleaseYear(String releaseYear);

    @Column
    public Optional<Movie> findById(UUID id);

    @Column
    public void deleteById(Integer id);


}