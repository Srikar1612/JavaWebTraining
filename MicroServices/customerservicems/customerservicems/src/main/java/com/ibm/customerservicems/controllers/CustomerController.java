package com.ibm.customerservicems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.customerservicems.entites.Customer;
import com.ibm.customerservicems.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/get-all")
	public ResponseEntity<?> getAllCustomers(){
		return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable Long id){
		return customerService.getCustomerById(id)
				.map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping
	public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
		try {
			Customer createdCustomer = customerService.createCustomer(customer);
			return new ResponseEntity<>(createdCustomer, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/email")
	public ResponseEntity<?> getCustomerByEmail(@RequestParam String email){
		return customerService.getCustomerByEmail(email)
				.map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateCustomer(@PathVariable Long id, Customer customerDetails){
		try {
			Customer updatedCustomer = customerService.updateCustomer(id, customerDetails);
			return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable Long id){
		try {
			customerService.deleteCustomer(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
