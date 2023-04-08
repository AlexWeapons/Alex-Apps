package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Marca;
import org.aarmas.trnetwork.examen.marcas.models.dao.IMarcaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MarcaServiceImpl implements IMarcaService{

	@Autowired
	private IMarcaDao marcaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAll() {
		return (List<Marca>) marcaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	@Query("select m from MARCAS where m.nombre = ?1")
	public Marca findByNombre(String nombre) {
		return marcaDao.findByNombre(nombre);
	}


}
