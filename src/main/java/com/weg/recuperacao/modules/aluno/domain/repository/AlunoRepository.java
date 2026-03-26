package com.weg.recuperacao.modules.aluno.domain.repository;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository {

    Aluno criarNovoALuno(Aluno novoAluno);

    boolean alunoJaCadastrado(String cpf);
}
