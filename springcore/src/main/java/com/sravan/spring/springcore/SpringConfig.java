package com.sravan.spring.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
