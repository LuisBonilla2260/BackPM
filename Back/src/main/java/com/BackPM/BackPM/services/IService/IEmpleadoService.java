package com.BackPM.BackPM.services.IService;

import com.BackPM.BackPM.models.Empleado;

public interface IEmpleadoService extends IBaseService<Empleado> {

    Empleado findByNombreEmpleado(String nombreEmpleado);

}
