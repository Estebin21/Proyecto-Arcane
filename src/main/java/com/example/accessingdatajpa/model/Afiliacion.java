package com.example.accessingdatajpa.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Afiliacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personaje")
    private Personaje personaje;

    @ManyToOne
    @JoinColumn(name = "id_organizacion")
    private Organizacion organizacion;

    private String rol;
    private LocalDate fecha_ingreso;

    protected Afiliacion() {}

    public Afiliacion(Personaje personaje, Organizacion organizacion, String rol, LocalDate fecha_ingreso) {
        this.personaje = personaje;
        this.organizacion = organizacion;
        this.rol = rol;
        this.fecha_ingreso = fecha_ingreso;
    }

    public Long getId() { return id; }
    public Personaje getPersonaje() { return personaje; }
    public void setPersonaje(Personaje personaje) { this.personaje = personaje; }
    public Organizacion getOrganizacion() { return organizacion; }
    public void setOrganizacion(Organizacion organizacion) { this.organizacion = organizacion; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    public LocalDate getFecha_ingreso() { return fecha_ingreso; }
    public void setFecha_ingreso(LocalDate fecha_ingreso) { this.fecha_ingreso = fecha_ingreso; }

    @Override
    public String toString() {
        return String.format("Afiliacion[id=%d, personaje='%s', organizacion='%s', rol='%s', fecha_ingreso='%s']",
                id, personaje.getNombre(), organizacion.getNombre(), rol, fecha_ingreso);
    }
}
