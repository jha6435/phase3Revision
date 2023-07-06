package com.krishna.SpringfirstFrom2ndSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.constructorInjection.Person;
import com.krishna.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//      Student student1 =(Student) context.getBean("std");
//      System.out.println(student1);
//      System.out.println(student1.getId());
       
       Person p= (Person) context.getBean("pern");
       System.out.println(p);
       
    }
}
