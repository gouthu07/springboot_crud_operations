package com.example.springboot_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.springboot_crud.dao.Employeedao;
import com.example.springboot_crud.dto.Employee;


@Service
public class Employeeservice {
	@Autowired
	Employeedao ed;
	
	public String insertionData(Employee employee)
	{
		
		return ed.insertionData(employee);
	}
	
	public String deletionData(int id)
	{
		
		return ed.deletionData(id);
	}
	
	public Employee fetchById(int id)
	{
		return ed.fetchById(id);
	}
	
	public List<Employee> fetchbyAll()
	{
		return ed.fetchbyAll();
	}
	
	public String deletebyAll()
	{
		
		return ed.deletebyAll();
	}
}
