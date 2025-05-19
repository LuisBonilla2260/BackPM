package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Pedido;
import com.BackPM.BackPM.services.IService.IPedidoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/pedidos")
public class PedidoController extends ABaseController<Pedido, IPedidoService> {

    private IPedidoService pedidoService;

    protected PedidoController(IPedidoService service) {
        super(service, "Pedidos");
        //TODO Auto-generated constructor stub
    }
    
    @GetMapping("/findByAdministrador/{id}")
    public List<Pedido> findByAdministradorId(@PathVariable Integer id) {
        return pedidoService.findByAdministradorId(id);
    }

    @GetMapping("/findByEmpleado/{id}")
    public List<Pedido> findByEmpleadoId(@PathVariable Integer id) {
        return pedidoService.findByEmpleadoId(id);
    }

    @GetMapping("/findByProducto/{id}")
    public List<Pedido> findByProductoId(@PathVariable Integer id) {
        return pedidoService.findByProductoId(id);
    }
}
