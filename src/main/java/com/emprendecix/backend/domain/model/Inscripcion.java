package com.emprendecix.backend.domain.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Inscripcion {
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    private EstadoInscripcion estado;
    private LocalDateTime fechaCreacion;
}
