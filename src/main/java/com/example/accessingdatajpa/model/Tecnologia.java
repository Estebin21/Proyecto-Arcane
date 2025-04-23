package com.example.accessingdatajpa.model;

import jakarta.persistence.*;

@Entity
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tecnologia;

    private String nombre;
    private String tipo;
    private String descripcion;

    protected Tecnologia() {}

    public Tecnologia(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Long getId_tecnologia() { return id_tecnologia; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return String.format("Tecnologia[id=%d, nombre='%s', tipo='%s', descripcion='%s']",
                id_tecnologia, nombre, tipo, descripcion);
    }
}
