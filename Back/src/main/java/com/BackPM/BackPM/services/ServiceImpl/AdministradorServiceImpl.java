package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Administrador;
import com.BackPM.BackPM.repositories.IAdministradorRepository;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.services.IService.IAdministradorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl extends ABaseService<Administrador> implements IAdministradorService {

    @Autowired
    private IAdministradorRepository repository;

    @Override
    protected IBaseRepository<Administrador, Long> getRepository() {
        return repository; // Ensure the repository is properly returned
    }

    @Override
    public Administrador findByTelefono(Long telefono) {
        return repository.findByTelefono(telefono); // Implement the method
    }

}