package com.weg.recuperacao.modules.aluno.application.controller;

import com.weg.recuperacao.modules.aluno.application.dtos.AlunoRequestDto;
import com.weg.recuperacao.modules.aluno.application.dtos.AlunoResponseDto;
import com.weg.recuperacao.modules.aluno.domain.service.AlunoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponseDto> criarNovoAluno(
            @Valid @RequestBody AlunoRequestDto alunoRequest
    ){
        var novoAluno = alunoService.salvarNovoAluno(alunoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(novoAluno);
    }
}
