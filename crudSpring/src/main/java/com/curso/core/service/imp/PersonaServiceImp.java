package com.curso.core.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.core.model.Persona;
import com.curso.core.repository.PersonaRepositorio;
import com.curso.core.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public List<Persona> listar() {
		return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Persona agregar(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona editar(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona eliminar(int id) {
		Persona p= repositorio.findById(id);
		if(p!=null) {
			repositorio.delete(p);
		}
		return p;
	}

	
	
}
