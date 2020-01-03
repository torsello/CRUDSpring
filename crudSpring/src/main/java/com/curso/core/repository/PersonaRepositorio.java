package com.curso.core.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.curso.core.model.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	Persona delete(Persona p);
}
