package com.weg.recuperacao.modules.problema.domain.repository;

import com.weg.recuperacao.modules.problema.domain.entity.Problema;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemaRepository {

    Problema criarProblema(Problema problema);
}
