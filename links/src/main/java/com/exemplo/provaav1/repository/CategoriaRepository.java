package com.exemplo.provaav1.repository;

import com.exemplo.provaav1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
