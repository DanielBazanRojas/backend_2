package com.emprendecix.backend.infraestructura.persistencia.repositorio;

import com.emprendecix.backend.infraestructura.persistencia.entidad.EmprendedorEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprendedorRepository extends JpaRepository<EmprendedorEntidad, Long> {
    boolean existsByDni(String dni);
    boolean existsByCorreo(String correo);
}