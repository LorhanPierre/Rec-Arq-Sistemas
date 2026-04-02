package com.weg.recuperacao.modules.ordemservico.application.mapper;

import com.weg.recuperacao.modules.ordemservico.application.dtos.OrdemServicoRequest;
import com.weg.recuperacao.modules.ordemservico.application.dtos.OrdemServicoResponse;
import com.weg.recuperacao.modules.ordemservico.domain.entity.OrdemServico;
import org.springframework.stereotype.Component;

@Component
public class OrdemServicoMapper {

    public OrdemServico toEntity(OrdemServicoRequest ordemRequest){
        return new OrdemServico(
        );
    }

    public OrdemServicoResponse toResponse(OrdemServico ordemServico){
        return new OrdemServicoResponse();
    }
}
