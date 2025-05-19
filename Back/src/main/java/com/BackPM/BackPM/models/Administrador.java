package com.BackPM.BackPM.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador extends ABaseEntity {

    @Column(name = "nombre")
    private String nombreAdministrador;

    @Column(name = "telefono")
    private Long telefono;

    // Getters y setters

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

}