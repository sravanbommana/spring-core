package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	/*******************************************************************************************************
	 * The main idea of using stand alone collections is for reusability
	 * 1. Add util schema in config and create a collection in config.xml file
	 * 2. now you can use same collection in multiple classes
	 ******************************************************************************************************/
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/sravan/spring/springcore/config.xml");
    	ProductList productList = (ProductList)context.getBean("productList");
        System.out.println(productList.toString());        

    }
}
