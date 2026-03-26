package com.weg.recuperacao.infra.respositories.professor;

import com.weg.recuperacao.modules.professor.domain.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProfessorRepository extends JpaRepository<Professor, Long> {
}
