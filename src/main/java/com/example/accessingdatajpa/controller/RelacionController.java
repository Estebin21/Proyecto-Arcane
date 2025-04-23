package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.model.Relacion;
import com.example.accessingdatajpa.repository.RelacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/relaciones")
public class RelacionController {

    private final RelacionRepository repository;

    public RelacionController(RelacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Relacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Relacion create(@RequestBody Relacion relacion) {
        return repository.save(relacion);
    }

    @GetMapping("/{id}")
    public Optional<Relacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
