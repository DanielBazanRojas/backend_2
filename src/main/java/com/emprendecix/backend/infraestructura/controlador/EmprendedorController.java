package com.emprendecix.backend.infraestructura.controlador;

import com.emprendecix.backend.application.service.EmprendedorService;
import com.emprendecix.backend.domain.model.Emprendedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprendedores")
public class EmprendedorController {

    private final EmprendedorService service;

    public EmprendedorController(EmprendedorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Emprendedor> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Emprendedor getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Emprendedor create(@RequestBody Emprendedor emprendedor) {
        return service.save(emprendedor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
