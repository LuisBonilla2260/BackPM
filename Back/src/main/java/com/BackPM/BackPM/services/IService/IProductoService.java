package com.BackPM.BackPM.services.IService;


import com.BackPM.BackPM.models.Producto;

import java.util.List;

public interface IProductoService extends IBaseService<Producto> {

    List<Producto>findByCategoriaId_id(Integer CategoriaId);

}
