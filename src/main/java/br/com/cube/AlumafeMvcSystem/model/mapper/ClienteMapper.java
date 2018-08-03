package br.com.cube.AlumafeMvcSystem.model.mapper;

import br.com.cube.AlumafeMvcSystem.model.dto.ClienteDTO;
import br.com.cube.AlumafeMvcSystem.model.entity.ClienteEntity;

public class ClienteMapper implements ClassMapper {

	@Override
	public ClienteEntity fromDtoToEntity(Object dto) {
		ClienteDTO cd = (ClienteDTO)dto;
		if (cd != null) {
			ClienteEntity ce = new ClienteEntity();
		    if (cd.getName() != null) {	ce.setName(cd.getName());}
		    if (cd.getEmail() != null) { ce.setEmail(cd.getEmail());}
		    if (cd.getEndereco() != null) {	ce.setAddress(cd.getEndereco());}
		    if (cd.getTell() != null) {	ce.setTell(cd.getTell());}
		    return ce;
		}
		return null;
	}

	@Override
	public ClienteDTO fromEntityToDto(Object entity) {
		ClienteEntity ce = (ClienteEntity)entity;
		if (ce != null) {
			ClienteDTO cd = new ClienteDTO();
		    if (ce.getName() != null) {	cd.setName(ce.getName());}
		    if (ce.getEmail() != null) { cd.setEmail(ce.getEmail());}
		    if (ce.getAddress() != null) {	cd.setEndereco(ce.getAddress());}
		    if (ce.getTell() != null) {	cd.setTell(ce.getTell());}
		    return cd;
		}
		return null;
	}

}
