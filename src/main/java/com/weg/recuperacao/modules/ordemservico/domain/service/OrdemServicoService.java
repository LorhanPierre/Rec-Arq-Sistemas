package com.weg.recuperacao.modules.ordemservico.domain.service;

import com.weg.recuperacao.modules.ordemservico.domain.repository.OrdemServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrdemServicoService {

    private final OrdemServicoRepository ordemServicoRepository;

}
