package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Administrador;
import com.BackPM.BackPM.services.IService.IAdministradorService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/administradores")
public class AdmininstradorController extends ABaseController<Administrador, IAdministradorService> {

    protected AdmininstradorController(IAdministradorService service) {
        super(service, "Administrador");
        //TODO Auto-generated constructor stub
    }

}
