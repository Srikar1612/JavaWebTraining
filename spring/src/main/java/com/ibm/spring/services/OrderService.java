package com.ibm.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {
	
	@Autowired
	public OrderService( @Qualifier("UPIService") PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

	
	private final PaymentService paymentService;
	
	public void makePayment(double amount) {
		paymentService.processPayment(amount);
	}
	
}
