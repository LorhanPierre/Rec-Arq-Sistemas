package com.weg.recuperacao.infra.respositories.turma;

import com.weg.recuperacao.modules.turma.domain.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTurmaRepository extends JpaRepository<Turma, Long> {
    boolean existsByTag(String tagTurma);
}
