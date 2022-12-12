package com.pumitha.springboot.backend.apirest1.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pumitha.springboot.backend.apirest1.models.entity.Cliente;
import com.pumitha.springboot.backend.apirest1.models.entity.Region;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
}
