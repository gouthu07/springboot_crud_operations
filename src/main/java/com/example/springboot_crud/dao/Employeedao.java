package com.example.springboot_crud.dao;


import java.util.List;
import java.util.Optional;

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
	
	public Employee fetchById(int id)
	{
		Optional<Employee> oe=er.findById(id);
		Employee e=oe.get();
		return e;
	}
	
	public List<Employee> fetchbyAll()
	{
		return er.findAll();
	}
	
	public String deletebyAll()
	{
		er.deleteAll();
		return "table deleted";
	}

}
