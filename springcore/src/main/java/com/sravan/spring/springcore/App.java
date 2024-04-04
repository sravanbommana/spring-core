package com.sravan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      Dao dao = context.getBean(Dao.class);
      dao.create();
    }
}
