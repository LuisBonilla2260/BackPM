package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Empleado;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IEmpleadoRepository;
import com.BackPM.BackPM.services.IService.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl  extends ABaseService<Empleado> implements IEmpleadoService{

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Empleado findByNombreEmpleado(String nombreEmpleado) {
        return empleadoRepository.findByNombreEmpleado(nombreEmpleado);
    }

    @Override
    protected IBaseRepository<Empleado, Long> getRepository() {
        return empleadoRepository;
    }

}
