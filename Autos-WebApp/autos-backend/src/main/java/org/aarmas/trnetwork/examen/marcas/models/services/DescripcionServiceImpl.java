package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Descripcion;
import org.aarmas.trnetwork.examen.marcas.models.dao.IDescripcionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DescripcionServiceImpl implements IDescripcionService{

	@Autowired
	private IDescripcionDao descripcionDao;
	
	@Override
	public List<Descripcion> findAll() {
		return (List<Descripcion>) descripcionDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<Descripcion> findBySubmarcaAndModelo(String nombreSubmarca, String nombreModelo) {
		return descripcionDao.findBySubmarcaAndModelo(nombreSubmarca, nombreModelo);
	}
	

}
