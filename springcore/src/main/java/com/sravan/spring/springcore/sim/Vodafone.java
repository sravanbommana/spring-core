package com.sravan.spring.springcore.sim;

public class Vodafone implements ServiceProvider{
	@Override
	public void recharge() {
		System.out.println("Reachring your Vodafone numer");
	}

	@Override
	public void sendSMS() {
		System.out.println("Rechared you number succesfully, Thank you for choosing Vodafone as service provider");
	}
}
