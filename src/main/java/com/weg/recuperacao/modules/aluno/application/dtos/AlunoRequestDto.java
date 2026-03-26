package com.weg.recuperacao.modules.aluno.application.dtos;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record AlunoRequestDto(
        @NotNull
        String nomeAluno,

        @CPF
        String cpf,

        @NotNull
        Long turma
) {
}
