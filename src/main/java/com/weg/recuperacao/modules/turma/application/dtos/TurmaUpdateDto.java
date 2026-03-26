package com.weg.recuperacao.modules.turma.application.dtos;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record TurmaUpdateDto(
        String nomeTurma,
        String tagTurma
) {
}
