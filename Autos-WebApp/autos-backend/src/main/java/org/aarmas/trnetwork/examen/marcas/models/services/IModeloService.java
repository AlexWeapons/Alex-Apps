package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Modelo;

public interface IModeloService {
	public List<Modelo> findAll();
	public Modelo findByNombre(String nombre);
}
