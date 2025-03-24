package br.com.filmearchive.filmearchive.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import br.com.filmearchive.filmearchive.DTO.ReviewsDTO;
import br.com.filmearchive.filmearchive.DTO.UsersDTO;
import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.Repository.UserRepository;
import br.com.filmearchive.filmearchive.models.Movie;


@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User registerOrUpdate(User users) {
        return (User) repository.save(users);
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

    public Optional<User> findbyEmail(String email) {
        return repository.findByEmail(email);
    }

    public br.com.filmearchive.filmearchive.models.User updateProfile(UsersDTO usersDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProfile'");
    }

    public List<UsersDTO> findByTitle(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByTitle'");
    }

    public List<UsersDTO> findByEmail(String email) {
   
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

    public List<ReviewsDTO> findByEmail(
            org.springframework.boot.autoconfigure.security.SecurityProperties.User author) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

    public List<ReviewsDTO> findByEmail(User author) {
      
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }

    public br.com.filmearchive.filmearchive.models.User registerOrUpdate(
            br.com.filmearchive.filmearchive.models.User model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerOrUpdate'");
    }

    public List<ReviewsDTO> findbyEmail(br.com.filmearchive.filmearchive.models.User author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findbyEmail'");
    }

    

}
