package com.felipe.spring1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.felipe.spring1.domain.Cliente;
import com.felipe.spring1.repositories.ClienteRepository;
import com.felipe.spring1.security.UserSS;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private ClienteRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Cliente cli = repo.findByEmail(email);
		if(cli == null) {
			throw new UsernameNotFoundException(email);
		}
		
		return new UserSS(cli.getId(),cli.getEmail(),cli.getSenha(), cli.getPerfis());
	}

}
