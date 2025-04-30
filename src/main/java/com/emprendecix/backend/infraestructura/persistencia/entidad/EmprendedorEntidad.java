package com.emprendecix.backend.infraestructura.persistencia.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_emprendedor", schema = "sc_emprendedores")
public class EmprendedorEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emprId;

    @Column(nullable = false)
    private Long usuarioId;

    private String emprNombre;
    private String emprCorreo;
    private String emprDescripcion;
    private String emprTelefono;
    private String emprUbicacion;
    private boolean emprVerificado;
    private String emprImagen;
    private LocalDateTime emprFechaCreacion;

    // Getters y setters
    public Long getEmprId() {
        return emprId;
    }

    public void setEmprId(Long emprId) {
        this.emprId = emprId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEmprNombre() {
        return emprNombre;
    }

    public void setEmprNombre(String emprNombre) {
        this.emprNombre = emprNombre;
    }

    public String getEmprCorreo() {
        return emprCorreo;
    }

    public void setEmprCorreo(String emprCorreo) {
        this.emprCorreo = emprCorreo;
    }

    public String getEmprDescripcion() {
        return emprDescripcion;
    }

    public void setEmprDescripcion(String emprDescripcion) {
        this.emprDescripcion = emprDescripcion;
    }

    public String getEmprTelefono() {
        return emprTelefono;
    }

    public void setEmprTelefono(String emprTelefono) {
        this.emprTelefono = emprTelefono;
    }

    public String getEmprUbicacion() {
        return emprUbicacion;
    }

    public void setEmprUbicacion(String emprUbicacion) {
        this.emprUbicacion = emprUbicacion;
    }

    public boolean isEmprVerificado() {
        return emprVerificado;
    }

    public void setEmprVerificado(boolean emprVerificado) {
        this.emprVerificado = emprVerificado;
    }

    public String getEmprImagen() {
        return emprImagen;
    }

    public void setEmprImagen(String emprImagen) {
        this.emprImagen = emprImagen;
    }

    public LocalDateTime getEmprFechaCreacion() {
        return emprFechaCreacion;
    }

    public void setEmprFechaCreacion(LocalDateTime emprFechaCreacion) {
        this.emprFechaCreacion = emprFechaCreacion;
    }
}
