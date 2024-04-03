package com.sravan.spring.springcore;

public class Patient {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("Inside init");
	}
	
	public void destroy() {
		System.out.println("Inside destroy");
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
}
