package com.emprendecix.backend.infraestructura.persistencia.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_emprendedor", schema = "sc_promemprendedores")
@Getter
@Setter
public class EmprendedorEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empr_id")
    private Long id;

    @Column(name = "empr_dni", length = 8, nullable = false, unique = true)
    private String dni;

    @Column(name = "empr_nombres", length = 100, nullable = false)
    private String nombres;

    @Column(name = "empr_apellidos", length = 100, nullable = false)
    private String apellidos;

    @Column(name = "empr_correo", length = 150, nullable = false, unique = true)
    private String correo;

    @Column(name = "empr_telefono", length = 15)
    private String telefono;

    @Column(name = "empr_direccion")
    private String direccion;

    @Column(name = "empr_fecha_registro")
    private LocalDateTime fechaRegistro;
}