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

@Entity
@Table(name="Cliente")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nome", nullable=false)
	private String name;
	
	@Column(name="endereco", nullable=false)
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone", nullable=false)
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
