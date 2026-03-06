package com.ibm.customerservicems.service;

import java.util.List;
import java.util.Optional;

import com.ibm.customerservicems.entites.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	Optional<Customer> getCustomerById(Long id);
	Optional<Customer> getCustomerByEmail(String email);
	Customer createCustomer(Customer customer);
	Customer updateCustomer(Long id, Customer customerDetails);
	void deleteCustomer(Long id);
}
