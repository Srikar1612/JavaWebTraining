package com.ibm.springjdbc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibm.springjdbc.model.Employee;

@Repository
public interface EmployeeDao {
	int save(Employee e);

	int update(Employee e);

	int delete(int id);

	Employee findById(int id);

	List<Employee> findAll();
}
