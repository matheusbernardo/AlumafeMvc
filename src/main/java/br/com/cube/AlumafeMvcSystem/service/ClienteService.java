package br.com.cube.AlumafeMvcSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cube.AlumafeMvcSystem.model.dto.ClienteDTO;
import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;
import br.com.cube.AlumafeMvcSystem.model.mapper.ClienteMapper;
import br.com.cube.AlumafeMvcSystem.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteDTO criaCliente(ClienteDTO clienteDto){
		ClienteMapper clienteMapper = new ClienteMapper();
		ClienteEntity clienteEntity = clienteMapper.fromDtoToEntity(clienteDto);
		return  clienteMapper.fromEntityToDto(this.clienteRepository.save(clienteEntity));
	}
	
	public List<ClienteDTO> listaClientes() {
		List<ClienteEntity> findAll = this.clienteRepository.findAll();
		if (!findAll.isEmpty()) {
			ClienteMapper clienteMapper = new ClienteMapper();
			List<ClienteDTO> arrayList = new ArrayList<>();
			findAll.forEach(x ->{
				arrayList.add(clienteMapper.fromEntityToDto(x));
			});
			return arrayList;
		}
		return null;
	}
}
