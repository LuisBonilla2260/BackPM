package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Factura;
import com.BackPM.BackPM.services.IService.IFacturaService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/facturas")
public class FacturaController extends ABaseController<Factura, IFacturaService> {
   
    private IFacturaService facturaService;

    
    protected FacturaController(IFacturaService service) {
        super(service, "Factura");
    }

    @GetMapping("/findByPedidoId/{pedidoId}")
    public Factura findByPedidoId(@PathVariable Integer pedidoId) {
        return facturaService.findByPedidoId(pedidoId);
    }

}
