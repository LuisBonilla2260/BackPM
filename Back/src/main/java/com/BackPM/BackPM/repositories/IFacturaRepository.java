package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Factura;

// import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends IBaseRepository<Factura, Long> {
    // Buscar por ID de pedido
    Factura findByPedidoId(Integer pedidoId);
}
