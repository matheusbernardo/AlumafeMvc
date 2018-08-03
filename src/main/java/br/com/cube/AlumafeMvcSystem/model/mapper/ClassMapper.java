package br.com.cube.AlumafeMvcSystem.model.mapper;

public interface ClassMapper {
	public Object fromDtoToEntity(Object dto);
	public Object fromEntityToDto(Object entity);
}
