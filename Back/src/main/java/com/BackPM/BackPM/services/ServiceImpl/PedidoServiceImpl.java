package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Pedido;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IPedidoRepository;
import com.BackPM.BackPM.services.IService.IPedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl extends ABaseService<Pedido> implements IPedidoService {

    @Autowired
    private IPedidoRepository pedidoRepository;

    @Override
    protected IBaseRepository<Pedido, Long> getRepository() {
        return pedidoRepository;
    }

    @Override
    public List<Pedido> findByAdministradorId(Integer administradorId) {
        return pedidoRepository.findByAdministradorId_Id(administradorId);
    }

    @Override
    public List<Pedido> findByEmpleadoId(Integer empleadoId) {
        return pedidoRepository.findByEmpleadoId_Id(empleadoId);
    }

    @Override
    public List<Pedido> findByProductoId(Integer productoId) {
        return pedidoRepository.findByProductoId_Id(productoId);
    }
}
