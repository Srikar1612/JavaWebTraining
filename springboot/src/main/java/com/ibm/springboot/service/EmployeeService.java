package com.ibm.springboot.service;

import java.util.List;

import com.ibm.springboot.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);
	public Employee creatEmployee(Employee employee);
	public Employee updateEmployee(Long id, Employee employee);
	public void deleteEmployee(Long id);
	public List<Employee> getByFirstNameLike(String pattern);
}
