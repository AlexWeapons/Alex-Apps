package org.aarmas.trnetwork.examen.marcas.models.services;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Modelo;
import org.aarmas.trnetwork.examen.marcas.models.dao.IModeloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ModeloServiceImpl implements IModeloService{

	@Autowired
	private IModeloDao modeloDao;
	
	@Override
	public List<Modelo> findAll() {
		return (List<Modelo>) modeloDao.findAll();
	}

	@Override
	@Transactional
	@Query("select m from MODELOS where m.nombre = ?1")
	public Modelo findByNombre(String nombre) {
		return modeloDao.findByNombre(nombre);
	}

}
