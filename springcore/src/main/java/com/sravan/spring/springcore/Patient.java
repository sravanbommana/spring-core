package com.sravan.spring.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	
	@PostConstruct
	public void init() {
		System.out.println("Initialize bean 1");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Destorying bean 1");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
}
