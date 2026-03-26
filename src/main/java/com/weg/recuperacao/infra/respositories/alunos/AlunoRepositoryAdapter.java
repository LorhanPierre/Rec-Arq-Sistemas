package com.weg.recuperacao.infra.respositories.alunos;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AlunoRepositoryAdapter implements AlunoRepository{

    private final JpaAlunoRepository  jpaAlunoRepository;
}
