package com.sravan.spring.springcore;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

public class Patient {
	
	private int id;
	private String name;
	private List<String> prescription;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPrescription() {
		return prescription;
	}

	public void setPrescription(List<String> prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", prescription=" + prescription + "]";
	}
	

}
