package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Administrador;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorRepository extends IBaseRepository<Administrador, Long> {
    // Buscar por teléfono del administrador
    Administrador findByTelefono(Long telefono);
}
