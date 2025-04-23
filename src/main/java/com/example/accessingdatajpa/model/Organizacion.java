package com.example.accessingdatajpa.model;

import jakarta.persistence.*;

@Entity
public class Organizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_organizacion;

    private String nombre;
    private String ciudad_base;
    private String tipo;

    protected Organizacion() {}

    public Organizacion(String nombre, String ciudad_base, String tipo) {
        this.nombre = nombre;
        this.ciudad_base = ciudad_base;
        this.tipo = tipo;
    }

    public Long getId_organizacion() { return id_organizacion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiudad_base() { return ciudad_base; }
    public void setCiudad_base(String ciudad_base) { this.ciudad_base = ciudad_base; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return String.format("Organizacion[id=%d, nombre='%s', ciudad_base='%s', tipo='%s']",
                id_organizacion, nombre, ciudad_base, tipo);
    }
}
