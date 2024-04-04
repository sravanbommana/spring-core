package com.sravan.spring.springcore.sim;

public class Airtel implements ServiceProvider {

	@Override
	public void recharge() {
		System.out.println("Reachring your airtel numer");
	}

	@Override
	public void sendSMS() {
		System.out.println("Rechared you number succesfully, Thank you for choosing airtel as service provider");
	}

	
}
