package com.exemplo.provaav1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.exemplo.provaav1.model.Categoria;
import com.exemplo.provaav1.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria listarCategoria(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletarPorId(Long id) {
        categoriaRepository.deleteById(id);
    }
}
