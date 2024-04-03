package com.sravan.spring.springcore;

public class Maths implements Subject{

	@Override
	public void prepareQuestions() {
		System.out.println("Preparing Math Questions");
	}

	@Override
	public void correctAnswerPaper() {
		System.out.println("Correcting Math Papers");
	}

	@Override
	public void declareResult() {
		System.out.println("Declaring Math Results");
	}
	
}
