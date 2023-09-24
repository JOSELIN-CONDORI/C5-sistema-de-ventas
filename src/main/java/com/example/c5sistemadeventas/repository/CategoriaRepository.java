package com.example.c5sistemadeventas.repository;

import com.example.c5sistemadeventas.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
