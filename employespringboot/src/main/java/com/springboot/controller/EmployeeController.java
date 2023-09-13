package com.springboot.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

	import com.springboot.entity.Employee;
	
	import com.springboot.service.EmployeeServiceImpl;

	@RestController
	public class EmployeeController {
		
		@Autowired
		private EmployeeServiceImpl empserv;
		
		@PostMapping("/emp")
		public String insertEmploye() {
			
			Employee employee= new Employee();
			employee.setName("Pandaari");
			employee.setDesignation("Asst.Manager");
			employee.setSalary(15600);
			
		Employee emp=empserv.saveEmployee(employee);
			return "employee "+emp.getName()+" with id "+emp.getId()+" is saved sucessfully";
			
		}
		
	}


