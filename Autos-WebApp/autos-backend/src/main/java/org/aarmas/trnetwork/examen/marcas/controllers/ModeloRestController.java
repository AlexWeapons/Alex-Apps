package org.aarmas.trnetwork.examen.marcas.controllers;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Modelo;
import org.aarmas.trnetwork.examen.marcas.models.services.ModeloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ModeloRestController {
	
	@Autowired
	private ModeloServiceImpl modeloService;
	
	@GetMapping("/modelos")
	public List<Modelo> getModelos() {
		return modeloService.findAll();
	}
	
	@GetMapping("/modelos/{nombre}")
	public Modelo getModelos(@PathVariable(name = "nombre") String nombre) {
		return modeloService.findByNombre(nombre);
	}
}
