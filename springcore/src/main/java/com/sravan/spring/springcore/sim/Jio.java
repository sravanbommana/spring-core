package com.sravan.spring.springcore.sim;

public class Jio implements ServiceProvider {

	@Override
	public void recharge() {
		System.out.println("Reachring your Jio numer");
	}

	@Override
	public void sendSMS() {
		System.out.println("Rechared you number succesfully, Thank you for choosing Jio as service provider");
	}

}
