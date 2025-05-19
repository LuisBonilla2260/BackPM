package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Detalle_Factura;
import com.BackPM.BackPM.services.IService.IDetalleFacturaService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/DetalleFactura")
public class Detalle_FacturaController extends ABaseController<Detalle_Factura, IDetalleFacturaService> {

    protected Detalle_FacturaController(IDetalleFacturaService service) {
        super(service, "DetalleFactura");
        //TODO Auto-generated constructor stub
    }

}
