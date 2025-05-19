package com.BackPM.BackPM.models;

import java.time.LocalDate;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "factura")
public class Factura extends ABaseEntity {

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "total", nullable = false)
    private Double total;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pedido_id", nullable = false)
    @JsonIgnoreProperties("facturas") // Evita la recursión infinita
    private Pedido pedido;

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
