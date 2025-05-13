package com.emprendecix.backend.infraestructura.persistencia.entidad;

import com.emprendecix.backend.domain.model.EstadoInscripcion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inscripciones", schema = "sc_promoemprendedores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class InscripcionEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String email;

    private String telefono;
    private String documento;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoInscripcion estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;
}
