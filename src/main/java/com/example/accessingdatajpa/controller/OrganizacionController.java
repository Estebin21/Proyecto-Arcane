package com.example.accessingdatajpa.controller;

import com.example.accessingdatajpa.model.Organizacion;
import com.example.accessingdatajpa.repository.OrganizacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/organizaciones")
public class OrganizacionController {

    private final OrganizacionRepository repository;

    public OrganizacionController(OrganizacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Organizacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Organizacion create(@RequestBody Organizacion organizacion) {
        return repository.save(organizacion);
    }

    @GetMapping("/{id}")
    public Optional<Organizacion> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
