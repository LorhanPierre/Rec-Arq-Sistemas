package com.weg.recuperacao.modules.aluno.application.dtos;

import com.weg.recuperacao.modules.turma.domain.entity.Turma;

public record AlunoResponseDto(
        Long aluno,
        String nomeAluno,
        String cpf,
        Long turma
) {
}
