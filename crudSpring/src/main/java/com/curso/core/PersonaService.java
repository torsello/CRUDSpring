package com.curso.core;

import java.util.List;

public interface PersonaService {

	List<Persona> listar();
	Persona listarId(int id);
	Persona agregar(Persona p);
	Persona editar(Persona p);
	Persona eliminar(int id);
	
}
