package com.ecoenergy.service;

import com.ecoenergy.model.Ambiente;
import com.ecoenergy.repository.AmbienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AmbienteService {

    private final AmbienteRepository ambienteRepository;

    public List<Ambiente> listarTodos() {
        return ambienteRepository.findAll();
    }

    public Optional<Ambiente> buscarPorId(Long id) {
        return ambienteRepository.findById(id);
    }

    public Ambiente salvar(Ambiente ambiente) {
        if (ambienteRepository.existsByNome(ambiente.getNome())) {
            throw new RuntimeException("Já existe um ambiente com este nome");
        }
        return ambienteRepository.save(ambiente);
    }

    public Ambiente atualizar(Long id, Ambiente ambiente) {
        Ambiente existente = ambienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ambiente não encontrado"));
        
        if (!existente.getNome().equals(ambiente.getNome()) 
                && ambienteRepository.existsByNome(ambiente.getNome())) {
            throw new RuntimeException("Já existe um ambiente com este nome");
        }
        
        existente.setNome(ambiente.getNome());
        existente.setDescricao(ambiente.getDescricao());
        existente.setIcone(ambiente.getIcone());
        existente.setCategoria(ambiente.getCategoria());
        
        return ambienteRepository.save(existente);
    }

    public void deletar(Long id) {
        if (!ambienteRepository.existsById(id)) {
            throw new RuntimeException("Ambiente não encontrado");
        }
        ambienteRepository.deleteById(id);
    }
}
