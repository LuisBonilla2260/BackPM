package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Categoria;
import com.BackPM.BackPM.repositories.ICategoriaRepository;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.services.IService.ICategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl extends ABaseService<Categoria> implements ICategoriaService {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    protected IBaseRepository<Categoria, Long> getRepository() {
        return categoriaRepository;
    }

    @Override
    public Optional<Categoria> getCategoriaByNombre(String nombre) {
        return categoriaRepository.findByNombreCategoria(nombre);
    }
}
