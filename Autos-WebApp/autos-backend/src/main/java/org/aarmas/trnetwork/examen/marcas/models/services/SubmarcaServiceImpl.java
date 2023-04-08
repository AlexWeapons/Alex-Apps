package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Submarca;
import org.aarmas.trnetwork.examen.marcas.models.dao.ISubmarcaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class SubmarcaServiceImpl implements ISubmarcaService{
	
	@Autowired 
	private ISubmarcaDao submarcaDao;

	@Override
	public List<Submarca> findAll() {
		return (List<Submarca>)submarcaDao.findAll();
	}

	@Override
	@Transactional
	@Query("select s from SUBMARCAS where S.nombre = ?1")
	public Submarca findByNombre(String nombre) {
		return submarcaDao.findByNombre(nombre);
	}

}
