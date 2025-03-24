package br.com.filmearchive.filmearchive.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class TheController {
    @GetMapping
    public String home() {
        return "Sup";
    }
     @RestController
    @RequestMapping("/api")
    @Tag(name = "Users API", description = "API de exemplo")
    public class ExampleController {
        @GetMapping("/exemplo")
        @Operation(summary = "Obter exemplo", description = "Obtém um exemplo")
        public String getName() {
            return "Exemplo";
        }
    }
}
