package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Pedido;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRepository extends IBaseRepository<Pedido, Long> {
    // Buscar pedidos por el ID del administrador
    List<Pedido> findByAdministradorId_Id(Integer administradorId);

    // Buscar pedidos por el ID del empleado
    List<Pedido> findByEmpleadoId_Id(Integer empleadoId);

    List<Pedido> findByProductoId_Id(Integer productoId);
}
