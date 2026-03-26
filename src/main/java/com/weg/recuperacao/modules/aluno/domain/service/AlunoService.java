package com.weg.recuperacao.modules.aluno.domain.service;

import com.weg.recuperacao.modules.aluno.application.dtos.AlunoRequestDto;
import com.weg.recuperacao.modules.aluno.application.dtos.AlunoResponseDto;
import com.weg.recuperacao.modules.aluno.application.mapper.AlunoMapper;
import com.weg.recuperacao.modules.aluno.domain.repository.AlunoRepository;
import com.weg.recuperacao.modules.turma.domain.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;
    private final AlunoMapper alunoMapper;

    @Transactional
    public AlunoResponseDto salvarNovoAluno(AlunoRequestDto alunoRequest){
        if(alunoRepository.alunoJaCadastrado(alunoRequest.cpf())){
            throw new RuntimeException("Aluno já cadastrado");
        }

        var novoAluno = alunoMapper.toEntity(alunoRequest);

        var turma = turmaRepository.buscarTurmaPorId(alunoRequest.turma())
                        .orElseThrow(() -> new RuntimeException("Turma não encontrada"));

        novoAluno.setTurma(turma);

        alunoRepository.criarNovoALuno(novoAluno);

        return alunoMapper.toResponse(novoAluno);
    }
}
