package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
        Student student = (Student)context.getBean("student");
        // Alternatively we can do like below
        Student student1 = context.getBean("student1", Student.class);
        student.printStudnetInfo();
        student1.printStudnetInfo();
    }
}
