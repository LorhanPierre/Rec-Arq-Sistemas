package com.weg.recuperacao.modules.problema.application.dtos;

public record ProblemaRequest (

        String nomeUsuario,
        String equipamentoComDefeito,
        String descricaoProblema

){
}
