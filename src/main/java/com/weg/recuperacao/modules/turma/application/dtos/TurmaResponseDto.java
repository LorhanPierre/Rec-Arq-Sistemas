package com.weg.recuperacao.modules.turma.application.dtos;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;

import java.util.List;

public record TurmaResponseDto(
            Long idTurma,
            String nomeTurma,
            String tagTurma,
            List<Aluno> alunos
) {
}
