package com.api.finances_control.repository;

import com.api.finances_control.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public interface LancamentoRepository extends JpaRepository<Lancamento, UUID> {
}
