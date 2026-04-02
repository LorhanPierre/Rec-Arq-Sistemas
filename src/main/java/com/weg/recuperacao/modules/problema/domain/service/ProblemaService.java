package com.weg.recuperacao.modules.problema.domain.service;

import com.weg.recuperacao.modules.problema.application.dtos.ProblemaRequest;
import com.weg.recuperacao.modules.problema.application.dtos.ProblemaResponse;
import com.weg.recuperacao.modules.problema.application.mapper.ProblemaMapper;
import com.weg.recuperacao.modules.problema.domain.repository.ProblemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProblemaService {

    private final ProblemaRepository problemaRepository;
    private final ProblemaMapper problemaMapper;

    public ProblemaResponse criarProblema(ProblemaRequest problemaRequest){
        var novoProblema = problemaMapper.toEntity(problemaRequest);

        problemaRepository.criarProblema(novoProblema);

        return problemaMapper.toResponse(novoProblema);
    }
}
