package com.weg.recuperacao.infra.respositories.turma;

import com.weg.recuperacao.modules.turma.domain.entity.Turma;
import com.weg.recuperacao.modules.turma.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class TurmaRepositoryAdapter implements TurmaRepository {

    private final JpaTurmaRepository jpaTurmaRepository;

    @Override
    public Optional<Turma> buscarTurmaPorId(Long idTurma) {
        return jpaTurmaRepository.findById(idTurma);
    }

    @Override
    public Turma adicionarNovaTurma(Turma turma) {
        return jpaTurmaRepository.save(turma);
    }

    @Override
    public boolean turmaJaCadastrada(String tagTurma) {
        return jpaTurmaRepository.existsByTag(tagTurma);
    }
}
