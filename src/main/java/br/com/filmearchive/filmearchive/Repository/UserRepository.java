package br.com.filmearchive.filmearchive.Repository;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Users;

public interface UserRepository extends JpaRepository<Users, String> {
    public Optional<User> findByName(String name);

    public Optional<Users> findByEmail(String email);

    public User save(Users users);

    public List<User> findAll();

    public Optional<User> findByCpf(Long cpf);

    public void deleteByCpf(Long cpf);

    public static Optional<Users> findById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public static Optional<Users> findById(Long cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public static void delete(Users users) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }



}
