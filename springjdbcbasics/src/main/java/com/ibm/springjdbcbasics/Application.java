package com.ibm.springjdbcbasics;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbcbasics.model.Employee;
import com.ibm.springjdbcbasics.templates.EmployeeJDBCTemplate;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeJDBCTemplate employeeJDBCTemplate= (EmployeeJDBCTemplate) applicationContext.getBean("employeeJdbcTemplateBean");
		System.out.println("---------------Record Creation----------------");
		employeeJDBCTemplate.create("Srikar", "V", 10000000);
		employeeJDBCTemplate.create("Smitha", "Raj", 15000);
		employeeJDBCTemplate.create("Allen", "Peter", 18000);
		
		System.out.println("----------Listing Multiple Employees----------");
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("ID: "+employee.getId());
			System.out.print(", First Name: "+employee.getFirstName());
			System.out.print(", Last Name: "+ employee.getLastName());
			System.out.println(", Salary: "+employee.getSalary());
			
		}
		
		employeeJDBCTemplate.update(3, "Allen", "Nelson", 20000);
		
		Employee employee = employeeJDBCTemplate.getEmployee(3);
		
		System.out.print("ID: "+employee.getId());
		System.out.print(", First Name: "+employee.getFirstName());
		System.out.print(", Last Name: "+ employee.getLastName());
		System.out.println(", Salary: "+employee.getSalary());
		
		employeeJDBCTemplate.delete(3);
		
		employees = employeeJDBCTemplate.listEmployees();
		
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee1 = (Employee) iterator.next();
			System.out.print("ID: "+employee1.getId());
			System.out.print(", First Name: "+employee1.getFirstName());
			System.out.print(", Last Name: "+ employee1.getLastName());
			System.out.println(", Salary: "+employee1.getSalary());
			
		}
		
		
	}
}