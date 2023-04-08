package org.aarmas.trnetwork.examen.marcas.controllers;

import java.util.List;

import org.aarmas.trnetwork.examen.marcas.models.Marca;
import org.aarmas.trnetwork.examen.marcas.models.services.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MarcaRestController {
	
	@Autowired
	private IMarcaService marcaService;
	
	@GetMapping("/marcas")
	public List<Marca> getMarcas(){
		return marcaService.findAll();
	}
	
	@GetMapping("/marcas/{nombre}")
	public Marca getMarcas(@PathVariable(name = "nombre") String nombre){
		return marcaService.findByNombre(nombre.toUpperCase());
	}

}
