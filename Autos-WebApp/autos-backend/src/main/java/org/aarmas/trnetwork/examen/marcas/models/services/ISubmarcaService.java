package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Submarca;

public interface ISubmarcaService {
	public List<Submarca> findAll();
	public Submarca findByNombre(String nombre);
}
