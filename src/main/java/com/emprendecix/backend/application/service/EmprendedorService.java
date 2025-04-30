package com.emprendecix.backend.application.service;

import com.emprendecix.backend.domain.model.Emprendedor;
import com.emprendecix.backend.domain.repository.EmprendedorRepositorio;

import java.util.List;
import java.util.Optional;

public class EmprendedorService {
    private final EmprendedorRepositorio repository;

    public EmprendedorService(EmprendedorRepositorio repository) {
        this.repository = repository;
    }

    public List<Emprendedor> getAll() {
        return repository.findAll();
    }

    public Optional<Emprendedor> getById(Long id) {
        return repository.findById(id);
    }

    public Emprendedor save(Emprendedor emprendedor) {
        return repository.save(emprendedor);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
