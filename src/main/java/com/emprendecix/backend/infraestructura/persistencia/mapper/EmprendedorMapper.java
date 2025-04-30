package com.emprendecix.backend.infraestructura.persistencia.mapper;

import com.emprendecix.backend.domain.model.Emprendedor;
import com.emprendecix.backend.infraestructura.persistencia.entidad.EmprendedorEntidad;

public class EmprendedorMapper {

    public static Emprendedor toModel(EmprendedorEntidad entity) {
        Emprendedor e = new Emprendedor();
        e.setId(entity.getEmprId());
        e.setUsuarioId(entity.getUsuarioId());
        e.setNombre(entity.getEmprNombre());
        e.setCorreo(entity.getEmprCorreo());
        e.setDescripcion(entity.getEmprDescripcion());
        e.setTelefono(entity.getEmprTelefono());
        e.setUbicacion(entity.getEmprUbicacion());
        e.setVerificado(entity.isEmprVerificado());
        e.setImagen(entity.getEmprImagen());
        e.setFechaCreacion(entity.getEmprFechaCreacion());
        return e;
    }

    public static EmprendedorEntidad toEntity(Emprendedor model) {
        EmprendedorEntidad e = new EmprendedorEntidad();
        e.setEmprId(model.getId());
        e.setUsuarioId(model.getUsuarioId());
        e.setEmprNombre(model.getNombre());
        e.setEmprCorreo(model.getCorreo());
        e.setEmprDescripcion(model.getDescripcion());
        e.setEmprTelefono(model.getTelefono());
        e.setEmprUbicacion(model.getUbicacion());
        e.setEmprVerificado(model.isVerificado());
        e.setEmprImagen(model.getImagen());
        e.setEmprFechaCreacion(model.getFechaCreacion());
        return e;
    }
}

