package com.example.accessingdatajpa.model;

import jakarta.persistence.*;

@Entity
public class UsoTecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_personaje")
    private Personaje personaje;

    @ManyToOne
    @JoinColumn(name = "id_tecnologia")
    private Tecnologia tecnologia;

    protected UsoTecnologia() {}

    public UsoTecnologia(Personaje personaje, Tecnologia tecnologia) {
        this.personaje = personaje;
        this.tecnologia = tecnologia;
    }

    public Long getId() { return id; }
    public Personaje getPersonaje() { return personaje; }
    public void setPersonaje(Personaje personaje) { this.personaje = personaje; }
    public Tecnologia getTecnologia() { return tecnologia; }
    public void setTecnologia(Tecnologia tecnologia) { this.tecnologia = tecnologia; }

    @Override
    public String toString() {
        return String.format("UsoTecnologia[id=%d, personaje='%s', tecnologia='%s']",
                id, personaje.getNombre(), tecnologia.getNombre());
    }
}
