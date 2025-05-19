package com.BackPM.BackPM.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detalle_factura")
public class Detalle_Factura extends ABaseEntity {

    @ManyToOne(fetch = FetchType.LAZY) // Optimización de rendimiento con carga perezosa
    @JoinColumn(name = "id_factura", nullable = false, referencedColumnName = "id")
    private Factura factura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false, referencedColumnName = "id")
    private Producto producto;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "precio_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(name = "subtotal", nullable = false, precision = 12, scale = 2)
    private BigDecimal subtotal;

    // Constructor vacío obligatorio para JPA
    public Detalle_Factura() {
    }

    // Getters y Setters
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
