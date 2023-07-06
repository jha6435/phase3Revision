package com.krishna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Employee emp= context.getBean("emp",Employee.class);
       System.out.println(emp);
    }
}
