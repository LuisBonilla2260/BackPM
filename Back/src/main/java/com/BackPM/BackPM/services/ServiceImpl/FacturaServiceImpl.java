package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Factura;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IFacturaRepository;
import com.BackPM.BackPM.services.IService.IFacturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends ABaseService<Factura> implements IFacturaService {

    @Autowired
    private IFacturaRepository facturaRepository;

    @Override
    protected IBaseRepository<Factura, Long> getRepository() {
        return facturaRepository;
    }

    @Override
    public Factura findByPedidoId(Integer pedidoId) {
        return facturaRepository.findByPedidoId(pedidoId);
    }
}
