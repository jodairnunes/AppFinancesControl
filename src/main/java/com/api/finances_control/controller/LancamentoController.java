package com.api.finances_control.controller;

import com.api.finances_control.dto.LancamentoDTO;
import com.api.finances_control.service.LancamentoSerivce;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/lancamentos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LancamentoController {

    private final LancamentoSerivce service;

    public LancamentoController(LancamentoSerivce service) {
        this.service = service;
    }

    @GetMapping
    public List<LancamentoDTO> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LancamentoDTO> buscarPorId(@PathVariable UUID id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public LancamentoDTO criar(@RequestBody LancamentoDTO dto) {
        return service.criar(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LancamentoDTO> atualizar(@PathVariable UUID id, @RequestBody LancamentoDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        return service.deletar(id);
    }
}
