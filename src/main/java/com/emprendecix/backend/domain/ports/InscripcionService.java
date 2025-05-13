package com.emprendecix.backend.domain.ports;

import com.emprendecix.backend.domain.model.Inscripcion;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;

@Service
public interface InscripcionService {
    Inscripcion crearInscripcion(Inscripcion inscripcion);
    List<Inscripcion> obtenerInscripcionesPendientes();
    Inscripcion aprobarInscripcion(Long id);
    Inscripcion rechazarInscripcion(Long id);
}
