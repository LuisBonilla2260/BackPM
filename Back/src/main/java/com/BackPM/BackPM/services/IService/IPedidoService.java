package com.BackPM.BackPM.services.IService;

import com.BackPM.BackPM.models.Pedido;

import java.util.List;

public interface IPedidoService extends IBaseService<Pedido> {
    List<Pedido> findByAdministradorId(Integer administradorId);
    List<Pedido> findByEmpleadoId(Integer empleadoId);
    List<Pedido> findByProductoId(Integer productoId);
}
