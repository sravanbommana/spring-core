package com.sravan.spring.springcore.sim;

public class Jio implements Sim{
	@Override
	public void call() {
		System.out.println("Service Provider:: Jio");
		
	}

	@Override
	public void talk() {
		System.out.println("Talking from Jio");
	}
}
