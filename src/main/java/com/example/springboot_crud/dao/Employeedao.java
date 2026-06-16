package com.example.springboot_crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot_crud.dto.Employee;
import com.example.springboot_crud.repository.Employeerepository;

@Repository
public class Employeedao {

	@Autowired
	Employeerepository er;
	
	public String insertionData(Employee employee)
	{
		er.save(employee);
		return "data inserted";
	}
	
	public String deletionData(int id)
	{
		er.deleteById(id);
		return "data deleted";
	}

}
