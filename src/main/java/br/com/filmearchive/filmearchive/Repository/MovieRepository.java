package br.com.filmearchive.filmearchive.Repository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
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
    public List<MovieDTO> findByTitle(String title);

    @Column
    public List<Movie> findAll();

    @Column
    public Movie save(Movie movie);

    @Column
    public Optional<Movie> findByGenre(String genre);

    @Column
    public List<MovieDTO> findByDirector(String director);

    @Column
    public List<MovieDTO> findbyReleaseYear(String releaseYear);

    @Column
    public static Optional<Movie> findById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Column
    public void deleteById(UUID id);

    public static void delete(Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public void deleteById(Integer id);


}