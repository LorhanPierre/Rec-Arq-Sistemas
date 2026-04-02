package com.weg.recuperacao.infra.respositories.professor;

import com.weg.recuperacao.modules.professor.domain.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProfessorRepositoryAdapter implements ProfessorRepository {

    private final JpaProfessorRepository jpaProfessorRepository;
}
