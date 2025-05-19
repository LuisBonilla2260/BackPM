package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Detalle_Factura;
import com.BackPM.BackPM.models.Empleado;

import org.springframework.stereotype.Repository;

@Repository
public interface IDetalle_FacturaRepository extends IBaseRepository<Detalle_Factura, Long> {

    // Empleado findByNombreEmpleado(String nombreEmpleado);

}
