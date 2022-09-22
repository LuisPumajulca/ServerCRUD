package com.pumitha.springboot.backend.apirest1.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pumitha.springboot.backend.apirest1.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
