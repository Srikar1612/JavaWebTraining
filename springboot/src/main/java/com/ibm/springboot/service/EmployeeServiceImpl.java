package com.ibm.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repository.EmployeeRepository;

@Service
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

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with id: "+id));
	}

	@Override
	public Employee creatEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employee;
		return employeeRepository.save(savedEmployee);
	}


	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee newEmployee = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id: "+id));
		newEmployee.setEmail(employee.getEmail());
		newEmployee.setFirstName(employee.getFirstName());
		newEmployee.setLastName(employee.getLastName());
		
		return employeeRepository.save(newEmployee);
	}

	@Override
	public List<Employee> getByFirstNameLike(String pattern) {
		// TODO Auto-generated method stub
		return employeeRepository.findByFirstNameLike("%"+pattern+"%");
	}


}
