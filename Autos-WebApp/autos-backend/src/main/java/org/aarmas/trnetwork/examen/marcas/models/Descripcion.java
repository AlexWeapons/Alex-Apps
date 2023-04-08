package org.aarmas.trnetwork.examen.marcas.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "descripciones")
public class Descripcion implements Serializable{

	private static final long serialVersionUID = -4357273149136865464L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOM_SEQ4")
	@SequenceGenerator(sequenceName = "incrementBy1", initialValue = 1, name = "CUSTOM_SEQ4")
	private Long id;
	
	@Column
	private String descripcion;
	
	@Column
	private String descripcionId;
	
	@ManyToOne
	@JoinColumn(name = "modelo")
	@JsonIgnore
	private Modelo modelo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
