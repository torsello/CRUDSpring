package com.curso.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins="http://127.0.0.1:4200", maxAge=3600)
@RestController
@RequestMapping({"/persona"})
public class Controlador {
	
	@Autowired
	PersonaService service;
	
	@GetMapping
	public List<Persona> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.agregar(p);
	}
	
	@GetMapping(path= {"/{id}"})
	public Persona listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path= {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
		p.setId(id);
		return service.editar(p);
	}
	
	@DeleteMapping(path= {"/{id}"})
	public Persona delete(@PathVariable("id") int id) {
		return service.eliminar(id);
	}
	
	
	
}
