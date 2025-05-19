package com.BackPM.BackPM.services.IService;

import com.BackPM.BackPM.models.Categoria;

import java.util.Optional;

public interface ICategoriaService extends IBaseService<Categoria> {
    Optional<Categoria> getCategoriaByNombre(String nombre); // Buscar categoría por nombre
}
