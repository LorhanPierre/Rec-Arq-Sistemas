package com.weg.recuperacao.modules.turma.application.dtos;

import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record TurmaRequestDto(
        @NotBlank
        String nomeTurma,
        @NotBlank
        @Max(value = 5)
        String tagTurma

) {
}
