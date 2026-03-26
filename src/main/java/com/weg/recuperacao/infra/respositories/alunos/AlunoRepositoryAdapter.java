package com.weg.recuperacao.infra.respositories.alunos;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import com.weg.recuperacao.modules.aluno.domain.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AlunoRepositoryAdapter implements AlunoRepository {

    private final JpaAlunoRepository  jpaAlunoRepository;

    @Override
    public Aluno criarNovoALuno(Aluno novoAluno) {
        return jpaAlunoRepository.save(novoAluno);
    }

    @Override
    public boolean alunoJaCadastrado(String cpf) {
        return jpaAlunoRepository.existsByCpf(cpf);
    }
}
