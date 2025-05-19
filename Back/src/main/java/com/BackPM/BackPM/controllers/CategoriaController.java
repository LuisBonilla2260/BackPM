package com.BackPM.BackPM.controllers;

import com.BackPM.BackPM.models.Categoria;
import com.BackPM.BackPM.services.IService.ICategoriaService;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/categorias")
public class CategoriaController extends ABaseController<Categoria, ICategoriaService> {

    private final ICategoriaService categoriaService;

    protected CategoriaController(ICategoriaService service) {
        super(service, "Categoria");
        this.categoriaService = service;
    }

    @GetMapping("/nombre/{nombre}")
    @PreAuthorize("permitAll()") // Acceso público a este endpoint
    public Optional<Categoria> getCategoriaByNombre(@PathVariable String nombre) {
        return categoriaService.getCategoriaByNombre(nombre);
    }
}
