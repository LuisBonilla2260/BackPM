package com.BackPM.BackPM.services.ServiceImpl;

import com.BackPM.BackPM.models.Producto;
import com.BackPM.BackPM.repositories.IBaseRepository;
import com.BackPM.BackPM.repositories.IProductoRepository;
import com.BackPM.BackPM.services.IService.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends ABaseService<Producto> implements IProductoService{
    
    @Autowired
    private IProductoRepository productorepository;
    
    @Override
    protected IBaseRepository<Producto, Long> getRepository() {
        return productorepository; // Ensure the repository is properly returned
    }

    @Override
    public List<Producto> findByCategoriaId_id(Integer CategoriaId) {
        return productorepository.findByCategoriaId_Id(CategoriaId);
    }

}
