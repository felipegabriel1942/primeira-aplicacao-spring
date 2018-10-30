package com.felipe.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.spring1.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
