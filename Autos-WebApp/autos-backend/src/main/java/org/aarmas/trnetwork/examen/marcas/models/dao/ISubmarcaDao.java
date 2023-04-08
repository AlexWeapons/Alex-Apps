package org.aarmas.trnetwork.examen.marcas.models.dao;

import org.aarmas.trnetwork.examen.marcas.models.Submarca;
import org.springframework.data.repository.CrudRepository;

public interface ISubmarcaDao extends CrudRepository<Submarca, Long>{
	Submarca findByNombre(String nombre);
}
