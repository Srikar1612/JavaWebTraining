package com.ibm.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvc.Dao.EmployeeDao;
import com.ibm.springmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private final EmployeeDao employeeDao;
	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.insertEmployee(employee);
	}
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

}
