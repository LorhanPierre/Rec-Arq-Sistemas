package com.weg.recuperacao.modules.aluno.domain.entity;

import com.weg.recuperacao.modules.turma.domain.entity.Turma;
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
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAluno;

    @Column(nullable = false)
    private String nomeAluno;

    @Column(nullable = false, unique = true, length = 13)
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "idTurma")
    private Turma turma;

    public Aluno(String nomeAluno, String cpf) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
    }

    public void toUpdate(String nome, String cpf){
        if(!nome.isBlank()){
            this.nomeAluno = nome;
        }
        if (!cpf.isBlank()){
            this.cpf = cpf;
        }
    }
}
