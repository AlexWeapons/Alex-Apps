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
@Table(name = "modelos")
public class Modelo implements Serializable{
	
	private static final long serialVersionUID = -6585626009727828154L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOM_SEQ3")
	@SequenceGenerator(sequenceName = "incrementBy1", initialValue = 1, name = "CUSTOM_SEQ3")
	private Long id;

	@Column
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name = "submarca")
	@JsonIgnore
	private Submarca submarca;
	
	@OneToMany(mappedBy = "modelo")
	private List<Descripcion> descripciones;

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

	public Submarca getSubmarca() {
		return submarca;
	}

	public void setSubmarca(Submarca submarca) {
		this.submarca = submarca;
	}

	public List<Descripcion> getDescripciones() {
		return descripciones;
	}

	public void setDescripciones(List<Descripcion> descripciones) {
		this.descripciones = descripciones;
	}

	
	
	
}
