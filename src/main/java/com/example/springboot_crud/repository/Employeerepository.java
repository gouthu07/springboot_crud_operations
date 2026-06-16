package com.example.springboot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_crud.dto.Employee;

public interface Employeerepository extends JpaRepository<Employee, Integer> {

}
