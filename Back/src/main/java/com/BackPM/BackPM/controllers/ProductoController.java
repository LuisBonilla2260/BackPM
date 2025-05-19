package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Producto;
import com.BackPM.BackPM.services.IService.IProductoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/productos")
public class ProductoController extends ABaseController<Producto, IProductoService> {
    
    private IProductoService productoService;
    
    protected ProductoController(IProductoService service) {
        super(service, "productos");
        //TODO Auto-generated constructor stub
    }
    
    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> getProductosByCategoria(@PathVariable Integer categoriaId) {
        return productoService.findByCategoriaId_id(categoriaId);
    }

}

