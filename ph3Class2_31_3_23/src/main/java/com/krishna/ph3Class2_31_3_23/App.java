package com.krishna.ph3Class2_31_3_23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext ac= new ClassPathXmlApplicationContext("com/krishna/ph3Class2_31_3_23/config.xml");
    Employee emp= ac.getBean("employee",Employee.class);
    	System.out.println(emp);
    	
    
    }
}
