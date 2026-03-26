package com.weg.recuperacao.modules.aluno.application.dtos;

import org.hibernate.validator.constraints.br.CPF;

public record AlunoUpdateDto (
        String nomeAluno,

        @CPF
        String cpf,

        Long turma
){
}
