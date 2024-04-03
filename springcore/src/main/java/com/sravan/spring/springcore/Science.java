package com.sravan.spring.springcore;

public class Science implements Subject{
	@Override
	public void prepareQuestions() {
		System.out.println("Preparing Science Questions");
	}

	@Override
	public void correctAnswerPaper() {
		System.out.println("Correcting Science Papers");
	}

	@Override
	public void declareResult() {
		System.out.println("Declaring Science Results");
	}
}
