package com.BackPM.BackPM.repositories;

import com.BackPM.BackPM.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends IBaseRepository<Producto, Long> {

    List<Producto>findByCategoriaId_Id (Integer categoriaId);

}
