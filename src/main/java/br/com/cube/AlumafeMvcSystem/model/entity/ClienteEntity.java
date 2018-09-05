package br.com.cube.AlumafeMvcSystem.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="Cliente")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nome")
	@NotBlank(message="O nome deve ser informado!")
	private String name;
	
	@Column(name="endereco")
	@NotBlank(message="O endereço deve ser informado!")
	private String endereco;
	
	@Column(name="email")
	@NotBlank(message="O email deve ser informado!")
	@Email(message="E-mail inválido")
	private String email;
	
	@Column(name="telefone")
	@NotBlank(message="O telefone deve ser informado!")
	private String tell;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cliente")
	private List<OrcamentoEntity> orcamentos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco= endereco;
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
	public List<OrcamentoEntity> getOrcamentos() {
		return orcamentos;
	}
	public void setOrcamentos(List<OrcamentoEntity> orcamentos) {
		this.orcamentos = orcamentos;
	}
}
