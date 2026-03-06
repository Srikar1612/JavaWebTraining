package com.ibm.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

//	@GetMapping("/employee")
//	public Employee getEmployeeById() {
//		return new Employee(1L,"Aman", "A", "Aman@ibm.com");
//	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
//		try {
//			Employee employee = employeeService.getEmployeeById(id);
//			return new ResponseEntity<>(employee, HttpStatus.OK);
//		} catch (RuntimeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return new ResponseEntity<>("Employee not found with id: ",HttpStatus.NOT_FOUND);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return new ResponseEntity<>("Unkown Exception",HttpStatus.NOT_FOUND);
//		}
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
	}
	
	@PostMapping
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.creatEmployee(employee));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/like/{pattern}")
	public ResponseEntity<?> getByFirstNameLike(@PathVariable("pattern") String pattern){
		return ResponseEntity.ok(employeeService.getByFirstNameLike(pattern));
	}
}
