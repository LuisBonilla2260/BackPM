package com.BackPM.BackPM.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido extends ABaseEntity {

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "administrador_id", nullable = false)
    private Administrador administradorId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleadoId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto productoId;

    // Getters y setters

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Administrador getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(Administrador administradorId) {
        this.administradorId = administradorId;
    }

    public Empleado getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Empleado empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }
}

