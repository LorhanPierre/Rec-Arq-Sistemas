package com.weg.recuperacao.infra.respositories.ordemservico;

import com.weg.recuperacao.modules.ordemservico.domain.entity.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
}
