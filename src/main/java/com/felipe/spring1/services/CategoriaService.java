package com.felipe.spring1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.spring1.domain.Categoria;
import com.felipe.spring1.repositories.CategoriaRepository;
import com.felipe.spring1.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(()-> new ObjectNotFoundException(
					"Objeto n]ao encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}
}
