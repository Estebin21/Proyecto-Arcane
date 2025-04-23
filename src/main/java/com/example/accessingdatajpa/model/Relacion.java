package com.example.accessingdatajpa.model;

import jakarta.persistence.*;

@Entity
public class Relacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personaje_a")
    private Personaje personajeA;

    @ManyToOne
    @JoinColumn(name = "id_personaje_b")
    private Personaje personajeB;

    private String tipo_relacion;

    protected Relacion() {}

    public Relacion(Personaje personajeA, Personaje personajeB, String tipo_relacion) {
        this.personajeA = personajeA;
        this.personajeB = personajeB;
        this.tipo_relacion = tipo_relacion;
    }

    public Long getId() { return id; }
    public Personaje getPersonajeA() { return personajeA; }
    public void setPersonajeA(Personaje personajeA) { this.personajeA = personajeA; }
    public Personaje getPersonajeB() { return personajeB; }
    public void setPersonajeB(Personaje personajeB) { this.personajeB = personajeB; }
    public String getTipo_relacion() { return tipo_relacion; }
    public void setTipo_relacion(String tipo_relacion) { this.tipo_relacion = tipo_relacion; }

    @Override
    public String toString() {
        return String.format("Relacion[id=%d, personajeA='%s', personajeB='%s', tipo_relacion='%s']",
                id, personajeA.getNombre(), personajeB.getNombre(), tipo_relacion);
    }
}
