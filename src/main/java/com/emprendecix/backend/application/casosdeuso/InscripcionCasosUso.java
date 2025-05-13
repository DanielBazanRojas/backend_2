package com.emprendecix.backend.application.casosdeuso;

import com.emprendecix.backend.domain.model.EstadoInscripcion;
import com.emprendecix.backend.domain.model.Inscripcion;
import com.emprendecix.backend.domain.ports.InscripcionService;
import com.emprendecix.backend.domain.ports.InscripcionPersistencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@RequiredArgsConstructor
public class InscripcionCasosUso {
    private final InscripcionPersistencia inscripcionPersistence;

    public Inscripcion crearInscripcion(Inscripcion inscripcion) {
        inscripcion.setEstado(EstadoInscripcion.PENDIENTE);
        inscripcion.setFechaCreacion(LocalDateTime.now());
        return inscripcionPersistence.save(inscripcion);
    }

    public List<Inscripcion> obtenerInscripcionesPendientes() {
        return inscripcionPersistence.findByEstado(EstadoInscripcion.PENDIENTE);
    }

    public Inscripcion aprobarInscripcion(Long id) {
        Inscripcion inscripcion = inscripcionPersistence.findById(id)
                .orElseThrow(() -> new RuntimeException("Inscripción no encontrada"));

        inscripcion.setEstado(EstadoInscripcion.APROBADA);
        return inscripcionPersistence.save(inscripcion);
    }

    public Inscripcion rechazarInscripcion(Long id) {
        Inscripcion inscripcion = inscripcionPersistence.findById(id)
                .orElseThrow(() -> new RuntimeException("Inscripción no encontrada"));

        inscripcion.setEstado(EstadoInscripcion.RECHAZADA);
        return inscripcionPersistence.save(inscripcion);
    }
}
