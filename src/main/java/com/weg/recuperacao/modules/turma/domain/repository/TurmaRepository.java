package com.weg.recuperacao.modules.turma.domain.repository;

import com.weg.recuperacao.modules.turma.domain.entity.Turma;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TurmaRepository {

    Optional<Turma> buscarTurmaPorId(Long idTurma);

    Turma adicionarNovaTurma(Turma turma);

    boolean turmaJaCadastrada(String tagTurma);
}
