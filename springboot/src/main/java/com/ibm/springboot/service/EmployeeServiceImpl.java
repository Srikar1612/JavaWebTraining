package com.ibm.springboot.service;

import java.util.List;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
