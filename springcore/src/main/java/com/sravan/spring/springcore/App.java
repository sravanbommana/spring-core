package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
       Hospital hospital = (Hospital)context.getBean("hospital");
       System.out.println(hospital.toString());
       
    }
}
