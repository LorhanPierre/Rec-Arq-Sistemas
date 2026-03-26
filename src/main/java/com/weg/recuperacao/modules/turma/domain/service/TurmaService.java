package com.weg.recuperacao.modules.turma.domain.service;

import com.weg.recuperacao.modules.turma.application.dtos.TurmaRequestDto;
import com.weg.recuperacao.modules.turma.application.dtos.TurmaResponseDto;
import com.weg.recuperacao.modules.turma.application.mapper.TurmaMapper;
import com.weg.recuperacao.modules.turma.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class TurmaService {

    private final TurmaRepository turmaRepository;
    private final TurmaMapper turmaMapper;

    @Transactional
    public TurmaResponseDto adicionarTurma(TurmaRequestDto turmaRequestDto){
        if (turmaRepository.turmaJaCadastrada(turmaRequestDto.tagTurma())){
            throw new RuntimeException("Turma já cadastrada");
        }

        var novaTurma = turmaMapper.toEntity(turmaRequestDto);

        turmaRepository.adicionarNovaTurma(novaTurma);

        return turmaMapper.toResponse(novaTurma);
    }
}
