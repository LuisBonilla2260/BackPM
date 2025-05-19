package com.BackPM.BackPM.services.IService;

import com.BackPM.BackPM.models.Administrador;

public interface IAdministradorService extends IBaseService<Administrador> {
    Administrador findByTelefono(Long telefono);
}
