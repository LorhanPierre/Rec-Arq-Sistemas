package com.weg.recuperacao.modules.problema.application.dtos;

public record ProblemaResponse(
        Long idOrdemServico,
        String nomeUsuario,
        String equipamentoComDefeito,
        String descricaoProblema
) {
}
