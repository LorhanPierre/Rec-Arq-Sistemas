package com.weg.recuperacao.modules.ordemservico.domain.entity;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Ordem_Servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdemServico;

    @Column
    private String equipamento;

    @Column
    private String statusOrdemServico;

    @Column
    private List<String> materiasUsados;

    @Column
    private String conclusaoTecnica;

    @OneToMany(mappedBy = "ordemServico")
    private List<Aluno> alunosEscalados;
}
