package br.com.cube.AlumafeMvcSystem.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String description;
	private float height;
	private float width;
	@ManyToOne
	private OrcamentoEntity orcamento;
	
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
