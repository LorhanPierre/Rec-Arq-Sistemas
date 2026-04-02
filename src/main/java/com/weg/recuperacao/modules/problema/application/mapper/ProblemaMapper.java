package com.weg.recuperacao.modules.problema.application.mapper;

import com.weg.recuperacao.modules.problema.application.dtos.ProblemaRequest;
import com.weg.recuperacao.modules.problema.application.dtos.ProblemaResponse;
import com.weg.recuperacao.modules.problema.domain.entity.Problema;
import org.springframework.stereotype.Component;

@Component
public class ProblemaMapper {

    public ProblemaResponse toResponse(Problema problema){
        return new ProblemaResponse(
                problema.getIdOrdemServico(),
                problema.getNomeUsuario(),
                problema.getEquipamentoComDefeito(),
                problema.getDescricaoProblema()
        );
    }

    public Problema toEntity(ProblemaRequest problemaRequest){
        return new Problema(
                problemaRequest.nomeUsuario(),
                problemaRequest.equipamentoComDefeito(),
                problemaRequest.descricaoProblema()
        );
    }
}
