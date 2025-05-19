package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Detalle_Factura;
import com.BackPM.BackPM.models.Empleado;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IDetalle_FacturaRepository;
import com.BackPM.BackPM.services.IService.IDetalleFacturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Detalle_FacturaServiceImpl extends ABaseService<Detalle_Factura> implements IDetalleFacturaService {

    @Autowired
    private IDetalle_FacturaRepository detalle_facturaRepository;

    @Override
    protected IBaseRepository<Detalle_Factura, Long> getRepository() {
        return detalle_facturaRepository; // Ensure the repository is properly returned
    }

    // @Override
    // public Empleado findByNombreEmpleado(String nombreEmpleado) {
    //     return detalle_facturaRepository.findByNombreEmpleado(nombreEmpleado); // Implement the method
    // }

}