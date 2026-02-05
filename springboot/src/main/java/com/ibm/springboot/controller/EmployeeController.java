package com.ibm.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@GetMapping("/employee")
	public Employee getEmployeeById() {
		return new Employee(1L,"Aman", "A", "Aman@ibm.com");
	}
	
}
