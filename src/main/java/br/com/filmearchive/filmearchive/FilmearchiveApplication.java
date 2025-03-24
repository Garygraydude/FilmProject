package br.com.filmearchive.filmearchive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "br.com.filmearchive.filmearchive.models")
@SpringBootApplication
public class FilmearchiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmearchiveApplication.class, args);
	}

}
