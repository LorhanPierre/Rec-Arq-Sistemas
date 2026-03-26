package com.weg.recuperacao.infra.respositories.professor;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProfessorRepositoryAdapter implements ProfessorRepository{

    private final JpaProfessorRepository jpaProfessorRepository;
}
