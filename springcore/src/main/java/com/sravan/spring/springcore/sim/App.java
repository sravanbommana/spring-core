package com.sravan.spring.springcore.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/sim/bean.xml");
		ServiceProvider serviceProvider = context.getBean("serviceProvider", ServiceProvider.class);
		serviceProvider.recharge();
		serviceProvider.sendSMS();
	}

}

