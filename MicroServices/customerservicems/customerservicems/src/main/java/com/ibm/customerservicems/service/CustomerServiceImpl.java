package com.ibm.customerservicems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.customerservicems.entites.Customer;
import com.ibm.customerservicems.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public Optional<Customer> getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return customerRepository.findByEmail(email);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(customerRepository.findByEmail(customer.getEmail()).isPresent())
			throw new RuntimeException("Customer with email "+customer.getEmail()+" alreadyExists");
		return customerRepository.save(customer);
			
	}

	@Override
	public Customer updateCustomer(Long id, Customer customerDetails) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer with id "+id+" does not exist"));
		customer.setFirstName(customerDetails.getFirstName());
		customer.setLastName(customerDetails.getLastName());
		customer.setAddress(customerDetails.getAddress());
		customer.setEmail(customerDetails.getEmail());
		customer.setPhone(customerDetails.getPhone());
		
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Customer with id "+id+" does not exist"));
		customerRepository.delete(customer);
		
	}

}
