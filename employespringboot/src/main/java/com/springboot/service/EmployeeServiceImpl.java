package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee saveEmployee(Employee emp) {
		return emprepo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return emprepo.save(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		emprepo.delete(emp);
	}

	@Override
	public Employee findById(int id) {
		return emprepo.findById(id).get();
	}

	@Override
	public List<Employee> findAll() {
		return emprepo.findAll();
	}

}
