package com.pumitha.springboot.backend.apirest1.models.services;

import java.util.List;

import com.pumitha.springboot.backend.apirest1.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
