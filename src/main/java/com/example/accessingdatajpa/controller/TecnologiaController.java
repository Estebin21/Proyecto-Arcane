package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.model.Tecnologia;
import com.example.accessingdatajpa.repository.TecnologiaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tecnologias")
public class TecnologiaController {

    private final TecnologiaRepository repository;

    public TecnologiaController(TecnologiaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Tecnologia> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Tecnologia create(@RequestBody Tecnologia tecnologia) {
        return repository.save(tecnologia);
    }

    @GetMapping("/{id}")
    public Optional<Tecnologia> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
