package com.weg.recuperacao.infra.respositories.problema;

import com.weg.recuperacao.modules.problema.domain.entity.Problema;
import com.weg.recuperacao.modules.problema.domain.repository.ProblemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProblemaRepositoryAdapter implements ProblemaRepository {

    private final JpaProblemaRepository jpaProblemaRepository;

    @Override
    public Problema criarProblema(Problema problema) {
        return jpaProblemaRepository.save(problema);
    }
}
