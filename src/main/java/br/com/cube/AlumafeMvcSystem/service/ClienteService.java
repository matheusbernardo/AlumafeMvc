package br.com.cube.AlumafeMvcSystem.service;

import java.util.ArrayList;
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
	
	public ClienteEntity save(ClienteEntity cliente){
		return this.clienteRepository.save(cliente);
	}
	
	public ClienteEntity findById(Long id) {
		Optional<ClienteEntity> find = this.clienteRepository.findById(id);
		if (find.isPresent()) {
			return find.get();
		}
		return null;
	}
	
	public List<ClienteEntity> findAll(){
		return this.clienteRepository.findAll();
	}
	
	public void deleteById(Long id) {
		this.clienteRepository.deleteById(id);
	}
	
}
