package org.aarmas.trnetwork.examen.marcas.models.dao;

import org.aarmas.trnetwork.examen.marcas.models.Modelo;
import org.springframework.data.repository.CrudRepository;

public interface IModeloDao extends CrudRepository<Modelo, Long>{
	Modelo findByNombre(String nombre);
}
