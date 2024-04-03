package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	// By default all beans are singleton scope, you can change it to prototype 
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
    	Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
        System.out.println(student.hashCode());
        
        Student student1 = (Student)context.getBean("student");
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());

    }
}
