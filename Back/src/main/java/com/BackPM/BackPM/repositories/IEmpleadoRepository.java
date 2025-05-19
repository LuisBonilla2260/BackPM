package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends IBaseRepository<Empleado, Long> {
    
    Empleado findByNombreEmpleado(String nombreEmpleado);

}
