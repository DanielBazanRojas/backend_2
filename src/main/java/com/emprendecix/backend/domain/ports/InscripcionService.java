package com.emprendecix.backend.domain.ports;

import com.emprendecix.backend.domain.model.Inscripcion;
import java.util.List;

public interface InscripcionService {
    Inscripcion crearInscripcion(Inscripcion inscripcion);
    List<Inscripcion> obtenerInscripcionesPendientes();
    Inscripcion aprobarInscripcion(Long id);
    Inscripcion rechazarInscripcion(Long id);
}
