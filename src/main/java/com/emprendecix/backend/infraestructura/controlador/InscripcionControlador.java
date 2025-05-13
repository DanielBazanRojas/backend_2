package com.emprendecix.backend.infraestructura.controlador;

import com.emprendecix.backend.domain.model.Inscripcion;
import com.emprendecix.backend.domain.ports.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscripciones")

public class InscripcionControlador {

    private final InscripcionService servicioInscripcion;

    public InscripcionControlador(InscripcionService servicioInscripcion) {
        this.servicioInscripcion = servicioInscripcion;
    }

    @PostMapping
    public ResponseEntity<Inscripcion> crearInscripcion(@RequestBody Inscripcion inscripcion) {
        Inscripcion nueva = servicioInscripcion.crearInscripcion(inscripcion);
        return ResponseEntity.ok(nueva);
    }

    @GetMapping("/pendientes")
    public ResponseEntity<List<Inscripcion>> obtenerPendientes() {
        List<Inscripcion> pendientes = servicioInscripcion.obtenerInscripcionesPendientes();
        return ResponseEntity.ok(pendientes);
    }

    @PostMapping("/aprobar/{id}")
    public ResponseEntity<Inscripcion> aprobarInscripcion(@PathVariable Long id) {
        Inscripcion aprobada = servicioInscripcion.aprobarInscripcion(id);
        return ResponseEntity.ok(aprobada);
    }

    @PostMapping("/rechazar/{id}")
    public ResponseEntity<Inscripcion> rechazarInscripcion(@PathVariable Long id) {
        Inscripcion rechazada = servicioInscripcion.rechazarInscripcion(id);
        return ResponseEntity.ok(rechazada);
    }
}
