package com.exemplo.provaav1.controller;

import com.exemplo.provaav1.model.*;
import com.exemplo.provaav1.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listaCategorias() {
        return categoriaService.listarCategorias();
    }

    @GetMapping("/{id}")
    public Categoria listarCategoria(@PathVariable Long id) {
        return categoriaService.listarCategoria(id);
    }
    
    @PostMapping
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.criarCategoria(categoria);   
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id) {
        categoriaService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
