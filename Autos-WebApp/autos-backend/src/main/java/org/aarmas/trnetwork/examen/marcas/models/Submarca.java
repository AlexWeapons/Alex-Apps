package org.aarmas.trnetwork.examen.marcas.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "submarcas")
public class Submarca implements Serializable{
	
	private static final long serialVersionUID = -8025656668430256788L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOM_SEQ2")
	@SequenceGenerator(sequenceName = "incrementBy1", initialValue = 1, name = "CUSTOM_SEQ2")
	private Long id;
	
	@Column
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "marca")
	@JsonIgnore
	private Marca marca;
	
	@OneToMany(mappedBy = "submarca")
	private List<Modelo> modelos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	
	
	
}
