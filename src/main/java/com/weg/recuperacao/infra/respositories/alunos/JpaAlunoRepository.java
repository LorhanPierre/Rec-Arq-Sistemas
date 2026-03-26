package com.weg.recuperacao.infra.respositories.alunos;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAlunoRepository extends JpaRepository<Aluno, Long> {
}
