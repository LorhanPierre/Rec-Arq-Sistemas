package com.weg.recuperacao.modules.turma.domain.entity;

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
@Table(name = "Turmas")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurma;

    @Column(nullable = false)
    private String nomeTurma;

    @Column(nullable = false, length = 5,unique = true)
    private String tagTurma;

    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;

    public Turma(String nomeTurma, String tagTurma) {
        this.nomeTurma = nomeTurma;
        this.tagTurma = tagTurma;
    }

    public void toUpdate(String nomeTurma, String tagTurma){
        if (!nomeTurma.isBlank()){
            this.nomeTurma = nomeTurma;
        }
        if (!tagTurma.isBlank()){
            this.tagTurma = tagTurma;
        }
    }
}
