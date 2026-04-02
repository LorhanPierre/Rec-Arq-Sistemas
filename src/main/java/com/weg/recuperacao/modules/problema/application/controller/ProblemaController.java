package com.weg.recuperacao.modules.problema.application.controller;

import com.weg.recuperacao.modules.problema.application.dtos.ProblemaRequest;
import com.weg.recuperacao.modules.problema.application.dtos.ProblemaResponse;
import com.weg.recuperacao.modules.problema.domain.service.ProblemaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problema")
@AllArgsConstructor
public class ProblemaController {

    private final ProblemaService problemaService;

    @PostMapping
    public ResponseEntity<ProblemaResponse> sinalizarProblema(
            @RequestBody ProblemaRequest problemaRequest
            ){
        var sinalizarProblema = problemaService.criarProblema(problemaRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(sinalizarProblema);
    }
}
