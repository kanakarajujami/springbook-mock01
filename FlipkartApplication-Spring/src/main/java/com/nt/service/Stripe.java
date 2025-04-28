package com.nt.service;

import org.springframework.stereotype.Component;

@Component("stripe")
public class Stripe implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("processing stripe payment:"+amount);

	}

	@Override
	public void validatePayment(String transactionId) {
     
		   System.out.println("validate stripe payment:"+transactionId);
	}

	@Override
	public void refundPayment(String transactionId) {
	
		System.out.println("refund stripe payment:"+transactionId);

	}

}
