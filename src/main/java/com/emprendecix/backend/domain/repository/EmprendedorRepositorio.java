package com.emprendecix.backend.domain.repository;

import com.emprendecix.backend.domain.model.Emprendedor;
import java.util.List;
import java.util.Optional;

public interface EmprendedorRepositorio {
    List<Emprendedor> findAll();
    Optional<Emprendedor> findById(Long id);
    Emprendedor save(Emprendedor emprendedor);
    void delete(Long id);
}
