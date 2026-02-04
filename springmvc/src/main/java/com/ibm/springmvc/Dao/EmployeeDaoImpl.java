package com.ibm.springmvc.Dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	private final JdbcTemplate jdbcTemplate;


	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into Employees(name, email, phone) values(?,?,?)";
		try {
			jdbcTemplate.update(sql,employee.getName(),employee.getEmail(),employee.getPhone());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
