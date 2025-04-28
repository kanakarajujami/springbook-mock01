package com.nt.service;

import org.springframework.stereotype.Component;

@Component("razorpay")
public class Razorpay implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
	
		 System.out.println("processing razorpay payment:"+amount);	  
	}

	@Override
	public void validatePayment(String transactionId) {
		
		System.out.println("validate razorpay payment:"+transactionId);

	}

	@Override
	public void refundPayment(String transactionId) {
	
		  System.out.println("refund razor payment:"+transactionId);

	}

}
