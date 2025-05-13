package com.emprendecix.backend.infraestructura.persistencia.repositorio;

import com.emprendecix.backend.domain.model.Emprendedor;
import com.emprendecix.backend.domain.repository.EmprendedorRepositorio;
import com.emprendecix.backend.infraestructura.persistencia.entidad.EmprendedorEntidad;
import com.emprendecix.backend.infraestructura.persistencia.mapper.EmprendedorMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class JpaEmprendedorRepositorio implements EmprendedorRepositorio {

    private final EmprendedorRepository jpaRepository;

    public JpaEmprendedorRepositorio(EmprendedorRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Emprendedor> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(EmprendedorMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Emprendedor> findById(Long id) {
        return jpaRepository.findById(id).map(EmprendedorMapper::toModel);
    }

    @Override
    public Emprendedor save(Emprendedor emprendedor) {
        EmprendedorEntidad entity = EmprendedorMapper.toEntity(emprendedor);
        return EmprendedorMapper.toModel(jpaRepository.save(entity));
    }

    @Override
    public void delete(Long id) {
        jpaRepository.deleteById(id);
    }
}
