package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.model.Personaje;
import com.example.accessingdatajpa.repository.PersonajeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    private final PersonajeRepository repository;

    public PersonajeController(PersonajeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Personaje> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Personaje> getById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Personaje create(@RequestBody Personaje personaje) {
        return repository.save(personaje);
    }

    @PutMapping("/{id}")
    public Personaje update(@PathVariable Long id, @RequestBody Personaje personaje) {
        return repository.save(personaje);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
