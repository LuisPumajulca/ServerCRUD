package com.pumitha.springboot.backend.apirest1.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pumitha.springboot.backend.apirest1.models.entity.Cliente;
import com.pumitha.springboot.backend.apirest1.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	@Query("from Region")
	public List<Region> findAllRegiones();
}
