package com.emprendecix.backend.infraestructura.persistencia.mapper;

import com.emprendecix.backend.domain.model.Inscripcion;
import com.emprendecix.backend.infraestructura.persistencia.entidad.InscripcionEntidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InscripcionMapper {
    InscripcionMapper INSTANCIA = Mappers.getMapper(InscripcionMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "telefono", source = "telefono")
    @Mapping(target = "documento", source = "documento")
    @Mapping(target = "estado", source = "estado")
    @Mapping(target = "fechaCreacion", source = "fechaCreacion")
    InscripcionEntidad aEntidad(Inscripcion dominio);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "telefono", source = "telefono")
    @Mapping(target = "documento", source = "documento")
    @Mapping(target = "estado", source = "estado")
    @Mapping(target = "fechaCreacion", source = "fechaCreacion")
    Inscripcion aDominio(InscripcionEntidad entidad);

    default List<Inscripcion> aListaDominio(List<InscripcionEntidad> entidades) {
        return entidades.stream()
                .map(this::aDominio)
                .toList();
    }
}
