package com.weg.recuperacao.infra.respositories.turma;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TurmaRepositoryAdapter implements TurmaRepository{

    private final JpaTurmaRepository jpaTurmaRepository;
}
