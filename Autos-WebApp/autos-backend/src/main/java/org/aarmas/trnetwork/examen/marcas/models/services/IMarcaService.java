package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Marca;

public interface IMarcaService {
	
	public List<Marca> findAll();
	
	public Marca findByNombre(String nombre);

}
