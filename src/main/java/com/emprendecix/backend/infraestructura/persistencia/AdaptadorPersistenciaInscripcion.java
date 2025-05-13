package com.emprendecix.backend.infraestructura.persistencia;

import com.emprendecix.backend.domain.model.Inscripcion;
import com.emprendecix.backend.domain.model.EstadoInscripcion;
import com.emprendecix.backend.domain.ports.InscripcionPersistencia;
import com.emprendecix.backend.infraestructura.persistencia.entidad.InscripcionEntidad;
import com.emprendecix.backend.infraestructura.persistencia.mapper.InscripcionMapper;
import com.emprendecix.backend.infraestructura.persistencia.repositorio.InscripcionJpaRepositorio;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class AdaptadorPersistenciaInscripcion implements InscripcionPersistencia {

    private final InscripcionJpaRepositorio repositorio;
    private final InscripcionMapper mapper;

    public AdaptadorPersistenciaInscripcion(InscripcionJpaRepositorio repositorio, InscripcionMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Inscripcion save(Inscripcion inscripcion) {
        InscripcionEntidad entidad = mapper.aEntidad(inscripcion);
        InscripcionEntidad entidadGuardada = repositorio.save(entidad);
        return mapper.aDominio(entidadGuardada);
    }

    @Override
    public Optional<Inscripcion> findById(Long id) {
        return repositorio.findById(id)
                .map(mapper::aDominio);
    }

    @Override
    public List<Inscripcion> findByEstado(EstadoInscripcion estado) {
        List<InscripcionEntidad> entidades = repositorio.findByEstado(estado);
        return mapper.aListaDominio(entidades);
    }
}
