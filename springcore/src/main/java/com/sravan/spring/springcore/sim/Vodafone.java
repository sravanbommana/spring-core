package com.sravan.spring.springcore.sim;

public class Vodafone implements Sim{
	@Override
	public void call() {
		System.out.println("Service Provider:: Airtel");
		
	}

	@Override
	public void talk() {
		System.out.println("Talking from Airtel");
	}
}
