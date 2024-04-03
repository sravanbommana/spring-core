package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***************************************************************************************************************
 * Practice using different auto wire types
 * 1. byType - this will check the type of variable and inject dependencies
 * 2. byName - this will check the name of variable and inject dependencies
 * 3. @Autowired - provide annotation on setter method
 * 	  i) we can use auto wired at filed level, constructor, setter method level
 * 4. @Qualifier - we use this annotation along with @Autowired, instead of using the filed name, in Qualifier
 * we will provide the name, then spring use the Qualifier name instead of filed name
 ***************************************************************************************************************/
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
       Employee employee = (Employee)context.getBean("employee");
       System.out.println(employee.toString());
    }
}
