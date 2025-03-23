package br.com.filmearchive.filmearchive.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.Repository.UserRepository;
import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.Users;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Users registerOrUpdate(Users users) {
        return (Users) repository.save(users);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findByCpf(Long cpf) {
        return repository.findByCpf(cpf);
    }

    public void remove(Long cpf) {
        repository.deleteByCpf(cpf);
    }

    public Optional<User> findbyName(String name) {
        return repository.findByName(name);
    }

    public Optional<Users> findbyEmail(String email) {
        return repository.findByEmail(email);
    }

}
