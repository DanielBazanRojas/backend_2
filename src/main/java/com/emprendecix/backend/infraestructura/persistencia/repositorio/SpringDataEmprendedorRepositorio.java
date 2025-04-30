package com.emprendecix.backend.infraestructura.persistencia.repositorio;

import com.emprendecix.backend.infraestructura.persistencia.entidad.EmprendedorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataEmprendedorRepositorio extends JpaRepository<EmprendedorEntidad, Long> {
}
