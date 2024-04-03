package com.sravan.spring.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int id;
	private String name;
	// We can use auto wired at filed level too like below
	//@Autowired
	private Address address;
	private PersonalInfo personalInfo;
	
	/*We can auto wired at constructor level like below
	@Autowired
	Employee(Address address) {
		this.address = address;
	}*/

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	
	@Autowired
	@Qualifier("personalInfo1")
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", personalInfo=" + personalInfo
				+ "]";
	}

}
