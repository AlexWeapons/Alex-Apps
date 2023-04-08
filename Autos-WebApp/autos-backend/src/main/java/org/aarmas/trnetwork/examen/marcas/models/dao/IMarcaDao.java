package org.aarmas.trnetwork.examen.marcas.models.dao;

import org.aarmas.trnetwork.examen.marcas.models.Marca;
import org.springframework.data.repository.CrudRepository;

public interface IMarcaDao extends CrudRepository<Marca, Long>{
	
	Marca findByNombre(String nombre);

}
