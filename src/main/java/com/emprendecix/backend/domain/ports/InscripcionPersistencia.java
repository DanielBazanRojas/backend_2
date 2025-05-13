package com.emprendecix.backend.domain.ports;

import com.emprendecix.backend.domain.model.Inscripcion;
import com.emprendecix.backend.domain.model.EstadoInscripcion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface InscripcionPersistencia {
    Inscripcion save(Inscripcion inscripcion);
    Optional<Inscripcion> findById(Long id);
    List<Inscripcion> findByEstado(EstadoInscripcion estado);
}
