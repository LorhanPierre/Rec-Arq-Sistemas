package com.weg.recuperacao.modules.turma.application.controller;

import com.weg.recuperacao.modules.turma.application.dtos.TurmaRequestDto;
import com.weg.recuperacao.modules.turma.application.dtos.TurmaResponseDto;
import com.weg.recuperacao.modules.turma.domain.service.TurmaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("alunos")
public class TurmaController {

    private final TurmaService turmaService;

    @PostMapping
    public ResponseEntity<TurmaResponseDto> adicionarNovaTurma(
            @Valid @RequestBody TurmaRequestDto turmaRequestDto
            ){

        var novaTurma = turmaService.adicionarTurma(turmaRequestDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(novaTurma);
    }

}
