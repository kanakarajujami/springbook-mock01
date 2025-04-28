package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkartService")
public class FlipkartService {
	
	@Autowired
	@Qualifier("stripe")
	private PaymentGateway paymentGateway;
	
	
	public void processPayment(Double amount) {
		
		paymentGateway.processPayment(amount);
	}
	
	public void validatePayment(String transactionId ) {
		
		  paymentGateway.validatePayment(transactionId);
	}
	
	public void refundPayment(String transactionId) {
		
		   paymentGateway.refundPayment(transactionId);
		
	}
}
