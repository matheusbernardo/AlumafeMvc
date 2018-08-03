package br.com.cube.AlumafeMvcSystem.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ClienteDTO {
    
	@NotNull
	@NotBlank
	@NotEmpty
	private String name;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String endereco;
	
	@NotNull
	@NotBlank
	@NotEmpty
	private String tell;
	
	@Email
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return this.getName() + "\n" +
			   this.getEmail() + "\n" +
			   this.getTell();
	}
}
