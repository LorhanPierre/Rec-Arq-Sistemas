package com.weg.recuperacao.modules.aluno.application.mapper;

import com.weg.recuperacao.modules.aluno.application.dtos.AlunoRequestDto;
import com.weg.recuperacao.modules.aluno.application.dtos.AlunoResponseDto;
import com.weg.recuperacao.modules.aluno.application.dtos.AlunoUpdateDto;
import com.weg.recuperacao.modules.aluno.domain.entity.Aluno;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public Aluno toEntity(AlunoRequestDto alunoRequestDto){
        return new Aluno(
                alunoRequestDto.nomeAluno(),
                alunoRequestDto.cpf()
        );
    }

    public Aluno toEntity(AlunoUpdateDto alunoUpdateDto){
        return new Aluno(
                alunoUpdateDto.nomeAluno(),
                alunoUpdateDto.cpf()
        );
    }

    public AlunoResponseDto toResponse(Aluno aluno){
        return new AlunoResponseDto(
                aluno.getIdAluno(),
                aluno.getNomeAluno(),
                aluno.getCpf(),
                aluno.getTurma().getIdTurma()
        );
    }
}
