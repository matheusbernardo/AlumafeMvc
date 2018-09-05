package br.com.cube.AlumafeMvcSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cube.AlumafeMvcSystem.model.entity.OrcamentoEntity;

@Repository
public interface OrcamentoRepository extends JpaRepository<OrcamentoEntity, Long> {
}
