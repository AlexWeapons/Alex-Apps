package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Descripcion;

public interface IDescripcionService {
	
	public List<Descripcion> findAll();
	List<Descripcion> findBySubmarcaAndModelo(String submarca, String modelo);

}
