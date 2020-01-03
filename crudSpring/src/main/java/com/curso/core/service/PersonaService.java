package com.curso.core.service;

import java.util.List;

import com.curso.core.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	Persona listarId(int id);
	Persona agregar(Persona p);
	Persona editar(Persona p);
	Persona eliminar(int id);
	
}
