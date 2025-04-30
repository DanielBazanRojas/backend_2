package com.emprendecix.backend.infraestructura.config;

import com.emprendecix.backend.application.service.EmprendedorService;
import com.emprendecix.backend.domain.repository.EmprendedorRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public EmprendedorService emprendedorService(EmprendedorRepositorio repository) {
        return new EmprendedorService(repository);
    }
}
