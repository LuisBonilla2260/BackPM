package com.BackPM.BackPM.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empleado") // Usa minúsculas para convenciones de nombres SQL
public class Empleado extends ABaseEntity implements Serializable {

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombreEmpleado;

    @Column(name = "telefono", nullable = false)
    private Long telefono;

    // Constructor vacío (requerido por JPA)
    public Empleado() {
    }

    // Constructor con parámetros (opcional, útil para crear objetos)
    public Empleado(String nombreEmpleado, Long telefono) {
        this.nombreEmpleado = nombreEmpleado;
        this.telefono = telefono;
    }

    // Getters y Setters

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

}
