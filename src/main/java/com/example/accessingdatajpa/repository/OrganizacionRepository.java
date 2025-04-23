package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.model.Organizacion;
import org.springframework.data.repository.CrudRepository;

public interface OrganizacionRepository extends CrudRepository<Organizacion, Long> {
}
