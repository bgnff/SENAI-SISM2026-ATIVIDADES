package com.ecoenergy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "equipamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Double potencia;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Integer horasUso;

    @Column(nullable = false)
    private Integer diasUso;

    private Double consumoMensal;

    @Column(name = "ambiente_id")
    private Long ambienteId;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PrePersist
    public void prePersist() {
        this.consumoMensal = calcularConsumo();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.consumoMensal = calcularConsumo();
        this.updatedAt = LocalDateTime.now();
    }

    private Double calcularConsumo() {
        if (potencia == null || horasUso == null || diasUso == null || quantidade == null) {
            return 0.0;
        }
        return (potencia * horasUso * diasUso * quantidade) / 1000.0;
    }
}
