package com.emprendecix.backend.infraestructura.persistencia.mapper;

import com.emprendecix.backend.domain.model.Emprendedor;
import com.emprendecix.backend.infraestructura.persistencia.entidad.EmprendedorEntidad;

public class EmprendedorMapper {

    public static Emprendedor toModel(EmprendedorEntidad entity) {
        if (entity == null) {
            return null;
        }

        return Emprendedor.builder()
                .id(entity.getId())
                .dni(entity.getDni())
                .nombres(entity.getNombres())
                .apellidos(entity.getApellidos())
                .correo(entity.getCorreo())
                .telefono(entity.getTelefono())
                .direccion(entity.getDireccion())
                .fechaRegistro(entity.getFechaRegistro())
                .build();
    }

    public static EmprendedorEntidad toEntity(Emprendedor model) {
        if (model == null) {
            return null;
        }

        EmprendedorEntidad entity = new EmprendedorEntidad();
        entity.setId(model.getId());
        entity.setDni(model.getDni());
        entity.setNombres(model.getNombres());
        entity.setApellidos(model.getApellidos());
        entity.setCorreo(model.getCorreo());
        entity.setTelefono(model.getTelefono());
        entity.setDireccion(model.getDireccion());
        entity.setFechaRegistro(model.getFechaRegistro());

        return entity;
    }
}
