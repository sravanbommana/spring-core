package com.sravan.spring.springcore.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/sim/bean.xml");
		// Airtel airtel = (Airtel)context.getBean("airtel");
		Sim sim = context.getBean("sim", Sim.class);
		sim.call();
		sim.talk();
	}

}
