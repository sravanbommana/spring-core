package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
       MyDAO myDAO = (MyDAO)context.getBean("myDAO");
       System.out.println(myDAO.toString());
    }
}
