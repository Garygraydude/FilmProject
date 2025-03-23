package br.com.filmearchive.filmearchive.Repository;

import java.util.Optional;

import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Users;

public interface UserRepository extends JpaRepository<Users, String> {
    public Optional<Users> findByName(String name);

    public Optional<Users> findByEmail(String email);



}
