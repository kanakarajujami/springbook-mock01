package com.nt.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PayPal implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
	
		   System.out.println("payment processing through paypal:"+amount);

	}

	@Override
	public void validatePayment(String transactionId) {
	
		   System.out.println("validate paypal payment:"+transactionId);
	}

	@Override
	public void refundPayment(String transactionId) {
	
		   System.out.println("refund paypal payment:"+transactionId);

	}

}
