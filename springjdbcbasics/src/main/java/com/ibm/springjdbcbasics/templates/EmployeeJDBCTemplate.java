package com.ibm.springjdbcbasics.templates;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.springjdbcbasics.EmployeeMapper;
import com.ibm.springjdbcbasics.dao.EmployeeDao;
import com.ibm.springjdbcbasics.model.Employee;

public class EmployeeJDBCTemplate implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String sql = "insert into Employee (firstName, lastName, salary) values (?,?,?)";
		jdbcTemplate.update(sql, firstName, lastName, salary);
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from Employee where id = ?";
		Employee employee=jdbcTemplate.queryForObject(sql, new EmployeeMapper(), id);
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		String sql = "select * from Employee";
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());
		return employees;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql = "delete from Employee where id = ?";
		jdbcTemplate.update(sql,id);
	}

	@Override
	public void update(Integer id, String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String sql = "update Employee set firstName = ?, lastName = ?, salary = ? where id = ?";
		jdbcTemplate.update(sql, firstName, lastName, salary,id);
	}

}
