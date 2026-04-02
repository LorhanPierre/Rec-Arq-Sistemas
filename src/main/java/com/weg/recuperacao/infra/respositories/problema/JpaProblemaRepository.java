package com.weg.recuperacao.infra.respositories.problema;

import com.weg.recuperacao.modules.problema.domain.entity.Problema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProblemaRepository extends JpaRepository<Problema,Long> {
}
