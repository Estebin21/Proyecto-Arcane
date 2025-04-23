package com.example.accessingdatajpa.model;

import jakarta.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_personaje;

    private String nombre;
    private String origen;
    private String rol;
    private String alineacion;

    protected Personaje() {}

    public Personaje(String nombre, String origen, String rol, String alineacion) {
        this.nombre = nombre;
        this.origen = origen;
        this.rol = rol;
        this.alineacion = alineacion;
    }

    public Long getId_personaje() {
        return id_personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    @Override
    public String toString() {
        return String.format("Personaje[id=%d, nombre='%s', origen='%s', rol='%s', alineacion='%s']",
                id_personaje, nombre, origen, rol, alineacion);
    }
}
