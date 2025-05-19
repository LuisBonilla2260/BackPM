package com.BackPM.BackPM.services.IService;

import com.BackPM.BackPM.models.Factura;

public interface IFacturaService extends IBaseService<Factura> {

    Factura findByPedidoId(Integer pedidoId); // Buscar por pedido_id

}
