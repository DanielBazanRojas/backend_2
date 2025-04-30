package com.emprendecix.backend.domain.model;

import java.time.LocalDateTime;

public class ParticipacionEvento {
    private Long id;
    private Long eventoId;
    private Long emprendedorId;
    private LocalDateTime fechaRegistro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventoId() {
        return eventoId;
    }

    public void setEventoId(Long eventoId) {
        this.eventoId = eventoId;
    }

    public Long getEmprendedorId() {
        return emprendedorId;
    }

    public void setEmprendedorId(Long emprendedorId) {
        this.emprendedorId = emprendedorId;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
