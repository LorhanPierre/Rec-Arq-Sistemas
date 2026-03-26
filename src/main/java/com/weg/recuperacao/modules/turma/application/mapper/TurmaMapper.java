package com.weg.recuperacao.modules.turma.application.mapper;

import com.weg.recuperacao.modules.aluno.application.dtos.AlunoRequestDto;
import com.weg.recuperacao.modules.turma.application.dtos.TurmaRequestDto;
import com.weg.recuperacao.modules.turma.application.dtos.TurmaResponseDto;
import com.weg.recuperacao.modules.turma.application.dtos.TurmaUpdateDto;
import com.weg.recuperacao.modules.turma.domain.entity.Turma;
import org.springframework.stereotype.Component;

@Component
public class TurmaMapper {

    public Turma toEntity(TurmaRequestDto turmaRequestDto){
        return new Turma(
                turmaRequestDto.nomeTurma(),
                turmaRequestDto.tagTurma().toUpperCase()
        );
    }

    public Turma toEntity(TurmaUpdateDto turmaUpdateDto){
        return new Turma(
                turmaUpdateDto.nomeTurma(),
                turmaUpdateDto.tagTurma().toUpperCase()
        );
    }

    public TurmaResponseDto toResponse(Turma turma){
        return new TurmaResponseDto(
                turma.getIdTurma(),
                turma.getNomeTurma(),
                turma.getTagTurma(),
                turma.getAlunos()
        );
    }
}
