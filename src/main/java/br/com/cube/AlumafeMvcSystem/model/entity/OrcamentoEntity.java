package br.com.cube.AlumafeMvcSystem.model.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Orcamento")
public class OrcamentoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="valor_total")
	@NotNull
	private BigDecimal fullValue;
	
	@ManyToOne
	private ClienteEntity cliente;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="orcamento")
	private List<ItemEntity> itens;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getFullValue() {
		return fullValue;
	}

	public void setFullValue(BigDecimal fullValue) {
		this.fullValue = fullValue;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public List<ItemEntity> getItens() {
		return itens;
	}

	public void setItens(List<ItemEntity> itens) {
		this.itens = itens;
	}
}
