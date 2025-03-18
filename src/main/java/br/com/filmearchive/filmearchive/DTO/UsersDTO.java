package br.com.filmearchive.filmearchive.DTO;

import java.util.ArrayList;
import java.util.List;

public class UsersDTO {
    private Long cpf;

    private String name;
    private String email;

    List<String> review = new ArrayList<>();

    public UsersDTO() {
    }

    public UsersDTO(Long cpf, String name, String email, List<String> review) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.review = review;
    }

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
