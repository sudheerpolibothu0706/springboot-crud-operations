package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;

@Service
public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployee(Employee emp); 
	public Employee findById(int id);
	
	public List<Employee> findAll();
}
