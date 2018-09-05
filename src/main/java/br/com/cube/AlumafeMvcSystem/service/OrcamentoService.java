package br.com.cube.AlumafeMvcSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cube.AlumafeMvcSystem.model.entity.OrcamentoEntity;
import br.com.cube.AlumafeMvcSystem.repository.OrcamentoRepository;

@Service
public class OrcamentoService {

	@Autowired
	private OrcamentoRepository orcamentoRepository;
	

	public OrcamentoEntity save(OrcamentoEntity orcamento) {
		return this.orcamentoRepository.save(orcamento);
	}
		
	public OrcamentoEntity find(Long id) {
		Optional<OrcamentoEntity> findById = this.orcamentoRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	public List<OrcamentoEntity> findAll(){
		return this.orcamentoRepository.findAll();
	}
}
