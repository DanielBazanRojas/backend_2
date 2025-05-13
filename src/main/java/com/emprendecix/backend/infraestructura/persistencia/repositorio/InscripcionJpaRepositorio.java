package com.emprendecix.backend.infraestructura.persistencia.repositorio;

import java.util.List;
import com.emprendecix.backend.domain.model.EstadoInscripcion;
import com.emprendecix.backend.infraestructura.persistencia.entidad.InscripcionEntidad;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InscripcionJpaRepositorio extends JpaRepository<InscripcionEntidad, Long> {
    List<InscripcionEntidad> findByEstado(EstadoInscripcion estado);
}
