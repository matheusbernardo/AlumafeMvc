package br.com.cube.AlumafeMvcSystem.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Table(name="Item")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank(message="A descrição do item deve ser informada!")
	private String description;
	
	@Positive(message="A altura do item deve ser informada!")
	private float height;
	
	@Positive(message="A largura do item deve ser informada!")
	private float width;
	
	@Positive(message="O valor deve ser maior que zero!")
	private BigDecimal value;
	
	@ManyToOne
	private OrcamentoEntity orcamento;	
	
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public OrcamentoEntity getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(OrcamentoEntity orcamento) {
		this.orcamento = orcamento;
	}
}
