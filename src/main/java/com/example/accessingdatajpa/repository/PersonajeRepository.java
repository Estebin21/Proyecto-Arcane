package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.model.Personaje;
import org.springframework.data.repository.CrudRepository;

public interface PersonajeRepository extends CrudRepository<Personaje, Long> {
}
