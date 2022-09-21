package com.pumitha.springboot.backend.apirest1.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pumitha.springboot.backend.apirest1.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
