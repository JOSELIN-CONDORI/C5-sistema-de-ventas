package com.example.c5sistemadeventas.service;

import com.example.c5sistemadeventas.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    public List<Categoria> listar();

    public Categoria guardar(Categoria categoria);

    public Categoria actualizar(Categoria categoria);

    public Optional<Categoria> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
