package com.krishna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.dao.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	  StudentDaoImpl result = context.getBean("daoImpl",StudentDaoImpl.class);
    	
    	int addStudent = result.addStudent();
    	System.out.println(addStudent);
    }
}
