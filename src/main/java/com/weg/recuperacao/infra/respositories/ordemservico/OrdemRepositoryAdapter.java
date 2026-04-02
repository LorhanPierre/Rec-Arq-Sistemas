package com.weg.recuperacao.infra.respositories.ordemservico;

import com.weg.recuperacao.modules.ordemservico.domain.repository.OrdemServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OrdemRepositoryAdapter implements OrdemServicoRepository {

    private final JpaOrdemServicoRepository jpaOrdemServicoRepository;
}
