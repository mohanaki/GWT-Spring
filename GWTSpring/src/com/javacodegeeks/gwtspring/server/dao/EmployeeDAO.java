package com.javacodegeeks.gwtspring.server.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.gwtspring.shared.dto.EmployeeDTO;


@Repository("employeeDAO")
public class EmployeeDAO extends JpaDAO<Long, EmployeeDTO> {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@PostConstruct
	public void init() {
		super.setEntityManagerFactory(entityManagerFactory);
	}
	
}