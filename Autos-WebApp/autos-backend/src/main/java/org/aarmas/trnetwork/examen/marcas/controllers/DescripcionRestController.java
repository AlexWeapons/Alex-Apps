package org.aarmas.trnetwork.examen.marcas.controllers;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Descripcion;
import org.aarmas.trnetwork.examen.marcas.models.services.DescripcionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DescripcionRestController {
	
	@Autowired
	private DescripcionServiceImpl descripcionService;
	
	@GetMapping("/descripciones")
	public List<Descripcion> getDescripciones() {
		return descripcionService.findAll();
	}
	
	@GetMapping("/descripciones/{submarca}/{modelo}")
	public List<Descripcion> getDescripciones(@PathVariable(name = "submarca") String submarca, 
			@PathVariable(name = "modelo") String modelo) {
		return descripcionService.findBySubmarcaAndModelo(submarca.toUpperCase(), modelo.toUpperCase());
	}
}
