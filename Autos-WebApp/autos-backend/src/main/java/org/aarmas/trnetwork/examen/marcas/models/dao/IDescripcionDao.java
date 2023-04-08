package org.aarmas.trnetwork.examen.marcas.models.dao;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Descripcion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IDescripcionDao extends CrudRepository<Descripcion, Long>{
	
	@Query("select d FROM Descripcion d JOIN d.modelo m JOIN m.submarca s WHERE s.nombre = ?1 AND m.nombre = ?2")	
	public List<Descripcion> findBySubmarcaAndModelo(String submarca, String modelo);
	
}
