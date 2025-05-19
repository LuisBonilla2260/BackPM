package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Empleado;
import com.BackPM.BackPM.repositories.IEmpleadoRepository;
import com.BackPM.BackPM.services.IService.IEmpleadoService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends ABaseController<Empleado, IEmpleadoService> {
    
    private IEmpleadoRepository empleadoRepository;

    protected EmpleadoController(IEmpleadoService service) {
        super(service, "empleados");
        //TODO Auto-generated constructor stub
    }

    //Implementar metodo para buscar empleado por nombre
    @GetMapping("/nombre/{nombreEmpleado}")
    public Empleado getEmpleadoByNombre(@PathVariable String nombreEmpleado) {
        return empleadoRepository.findByNombreEmpleado(nombreEmpleado);
    }
}
