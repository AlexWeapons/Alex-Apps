package org.aarmas.trnetwork.examen.marcas.controllers;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Submarca;
import org.aarmas.trnetwork.examen.marcas.models.services.SubmarcaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SubmarcasRestController {
	
	@Autowired
	private SubmarcaServiceImpl submarcaService;
	
	@GetMapping("/submarcas")
	public List<Submarca> getSubmarcas(){
		return submarcaService.findAll();
	}
	
	@GetMapping("/submarcas/{nombre}")
	public Submarca getSubmarcas(@PathVariable(name = "nombre") String nombre){
		return submarcaService.findByNombre(nombre.toUpperCase());
	}
	
}
