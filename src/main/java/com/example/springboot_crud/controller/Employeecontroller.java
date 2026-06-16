package com.example.springboot_crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_crud.dto.Employee;

import com.example.springboot_crud.service.Employeeservice;

@RestController
@RequestMapping("/employees")
public class Employeecontroller {
	 @Autowired
	  Employeeservice service;
	@PostMapping
	public String insertall(@RequestBody Employee employee )
	{
		return service.insertionData(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteall(@PathVariable int id)
	{
		return service.deletionData(id);
	}

}
