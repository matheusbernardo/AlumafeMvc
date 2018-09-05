package br.com.cube.AlumafeMvcSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
}
