package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Categoria;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoriaRepository extends IBaseRepository<Categoria, Long> {
    // Buscar por el nombre de la categoría
    Optional<Categoria> findByNombreCategoria(String nombreCategoria);
}
