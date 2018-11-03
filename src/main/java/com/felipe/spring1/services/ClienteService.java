package com.felipe.spring1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.spring1.domain.Cliente;
import com.felipe.spring1.repositories.ClienteRepository;
import com.felipe.spring1.services.exceptions.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
			return obj.orElseThrow(()-> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}
}
