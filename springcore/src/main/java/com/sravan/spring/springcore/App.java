package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
      Instructor instructor = context.getBean("instructor", Instructor.class);
      System.out.println(instructor);
    }
}
