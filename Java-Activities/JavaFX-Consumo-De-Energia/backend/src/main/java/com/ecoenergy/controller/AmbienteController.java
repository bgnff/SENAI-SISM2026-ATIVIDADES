package com.ecoenergy.controller;

import com.ecoenergy.model.Ambiente;
import com.ecoenergy.service.AmbienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ambientes")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5173"})
public class AmbienteController {

    private final AmbienteService ambienteService;

    @GetMapping
    public ResponseEntity<List<Ambiente>> listarTodos() {
        return ResponseEntity.ok(ambienteService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ambiente> buscarPorId(@PathVariable Long id) {
        return ambienteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ambiente> criar(@Valid @RequestBody Ambiente ambiente) {
        try {
            Ambiente salvo = ambienteService.salvar(ambiente);
            return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ambiente> atualizar(@PathVariable Long id, @Valid @RequestBody Ambiente ambiente) {
        try {
            Ambiente atualizado = ambienteService.atualizar(id, ambiente);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        try {
            ambienteService.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
