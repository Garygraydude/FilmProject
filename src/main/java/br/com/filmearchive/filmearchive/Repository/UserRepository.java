package br.com.filmearchive.filmearchive.Repository;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

import br.com.filmearchive.filmearchive.models.Movie;


public interface UserRepository extends JpaRepository<User, String> {
    public Optional<User> findByName(String name);

    public Optional<User> findByEmail(String email);

    public User save(User users);

    public List<User> findAll();

    public Optional<User> findByCpf(Long cpf);

    public void deleteByCpf(Long cpf);

    public static Optional<br.com.filmearchive.filmearchive.models.User> findById() {
        
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public static Optional<br.com.filmearchive.filmearchive.models.User> findById(Long cpf) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public static void delete(br.com.filmearchive.filmearchive.models.User users) {
       
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }



}
