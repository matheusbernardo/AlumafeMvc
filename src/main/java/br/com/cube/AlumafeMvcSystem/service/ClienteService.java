package br.com.cube.AlumafeMvcSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;
import br.com.cube.AlumafeMvcSystem.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteEntity save(ClienteEntity clienteEntity){
		return this.clienteRepository.save(clienteEntity);
	}
		
	public ClienteEntity find(Long id) {
		Optional<ClienteEntity> findById = this.clienteRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	public List<ClienteEntity> findAll() {
		return this.clienteRepository.findAll();
	}
	
	public void delete(Long id) {
		this.clienteRepository.deleteById(id);
	}
}
