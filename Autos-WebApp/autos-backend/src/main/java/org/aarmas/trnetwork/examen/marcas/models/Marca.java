package org.aarmas.trnetwork.examen.marcas.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "marcas")
public class Marca implements Serializable{
	
	private static final long serialVersionUID = -8536348097146584980L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOM_SEQ1")
	@SequenceGenerator(sequenceName = "incrementBy1", initialValue = 1, name = "CUSTOM_SEQ1")
	private Long id;
	
	@Column
	private String nombre;
	
	@OneToMany(mappedBy = "marca")
	private List<Submarca> submarcas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Submarca> getSubmarcas() {
		return submarcas;
	}

	public void setSubarcas(List<Submarca> submarcas) {
		this.submarcas = submarcas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
