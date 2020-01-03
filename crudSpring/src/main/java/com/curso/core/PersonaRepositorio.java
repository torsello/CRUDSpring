package com.curso.core;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	Persona delete(Persona p);
}
