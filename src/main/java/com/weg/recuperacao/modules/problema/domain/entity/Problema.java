package com.weg.recuperacao.modules.problema.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Problema")
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdemServico;

    @Column(nullable = false)
    private String nomeUsuario;

    @Column(nullable = false)
    private String equipamentoComDefeito;

    @Column(nullable = false)
    private String descricaoProblema;

    public Problema(String nomeUsuario, String equipamentoComDefeito, String descricaoProblema) {
        this.nomeUsuario = nomeUsuario;
        this.equipamentoComDefeito = equipamentoComDefeito;
        this.descricaoProblema = descricaoProblema;
    }

}
