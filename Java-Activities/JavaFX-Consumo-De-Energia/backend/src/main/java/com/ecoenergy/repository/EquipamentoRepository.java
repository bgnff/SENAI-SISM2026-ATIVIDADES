package com.ecoenergy.repository;

import com.ecoenergy.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
    List<Equipamento> findByAmbienteId(Long ambienteId);
    List<Equipamento> findByTipo(String tipo);
    Optional<Equipamento> findByNome(String nome);
    boolean existsByNome(String nome);
}
