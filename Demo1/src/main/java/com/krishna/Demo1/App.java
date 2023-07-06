package com.krishna.Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Student s=(Student) context.getBean("student1");
    	Student s2=(Student) context.getBean("student2");
    	System.out.println(s);
    	System.out.println(s2);
   
    }
}
