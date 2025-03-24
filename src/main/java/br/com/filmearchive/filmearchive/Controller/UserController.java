package br.com.filmearchive.filmearchive.Controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.filmearchive.filmearchive.DTO.MovieDTO;
import br.com.filmearchive.filmearchive.DTO.UsersDTO;
import br.com.filmearchive.filmearchive.Repository.MovieRepository;
import br.com.filmearchive.filmearchive.Repository.UserRepository;
import br.com.filmearchive.filmearchive.Service.MovieService;
import br.com.filmearchive.filmearchive.Service.UserService;
import br.com.filmearchive.filmearchive.models.Movie;
import br.com.filmearchive.filmearchive.models.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class UserController {
    private UserService service;
    @Autowired
    private UserService UserService;

    public UserController(UserService service) {
        this.service = service;
    }
    
   

    @PostMapping
    public void register(@RequestBody UsersDTO user) {
        User newUsers = service.registerOrUpdate(user.toModel());
    }

 @PutMapping("/update")
 public ResponseEntity<?> updateProfile(@RequestBody UsersDTO usersDTO) {
     try {

         User updatedUser = UserService.updateProfile(usersDTO);

         return ResponseEntity.ok(updatedUser);
     } catch (Exception e) {

         return ResponseEntity.status(404).body("Usuario não encontrado");
     }
 }
   public List<User> findAll() {
        return UsersDTO.findAll();
    }
@GetMapping("/Users/{id}")
public ResponseEntity<?> findById(@PathVariable Long cpf) {
    Optional<User> entityOptional = UserRepository.findById();

    if (entityOptional.isPresent()) {
        return ResponseEntity.ok(entityOptional.get());
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entidade nao encontrada");
    }
}
    
@Autowired
private UserRepository myEntityRepository;

public boolean remove(Long cpf) {
    Optional<User> entity = UserRepository.findById(cpf);

    if (entity.isPresent()) {
        UserRepository.delete(entity.get());
        return true;
    }

    return false; // its 2AM right now....
}

 @GetMapping("/Users")
 public ResponseEntity<List<UsersDTO>> findByName(String name) {
     List<UsersDTO> UsersDTOs = UserService.findByTitle(name);

     if (UsersDTOs.isEmpty()) {
         return ResponseEntity.noContent().build();
     }

     return ResponseEntity.ok(UsersDTOs);
 }

    @GetMapping("/Users")
    public ResponseEntity<List<UsersDTO>> findByEmail(String email) {
        List<UsersDTO> UsersDTOs = UserService.findByEmail(email);

        if (UsersDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(UsersDTOs);
    }

 
}