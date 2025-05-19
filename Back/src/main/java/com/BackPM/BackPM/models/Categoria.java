package com.BackPM.BackPM.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria extends ABaseEntity {

    @Column(name = "nombre")
    private String nombreCategoria;

    ///Getter & Setters

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
