package br.com.filmearchive.filmearchive.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long cpf;
@Column(length = 150, nullable = false)
private String name;
    @Column(length = 150, nullable = false)
    private String email;
    @Column(length = 150, nullable = false)
    List<String> review = new ArrayList<>();
    
    public User(){}

    public User(Long cpf, String name, String email, List<String> review) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.review = review;
    }

 @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reviews> reviews;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail() {
        this.email = email;
    }


}
