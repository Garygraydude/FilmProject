package br.com.filmearchive.filmearchive.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {
    @GetMapping
    public String home() {
        return "Sup";
    }
}
