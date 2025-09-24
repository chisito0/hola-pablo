package com.plexus.hola.pablo.controller;

import com.plexus.hola.pablo.model.Persona;
import com.plexus.hola.pablo.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    private final PersonaRepository repo;

    public PersonaController(PersonaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Persona> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Persona crear(@RequestBody Persona persona) {
        return repo.save(persona);
    }
}
