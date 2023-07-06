package com.krishna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.dao.StudentDaoImpl;
import com.krishna.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    StudentDaoImpl sdao = context.getBean("studentDao",StudentDaoImpl.class);
       
       Student student=new Student(1001, "rupesh", "paris");
       int result = sdao.insert(student);
       
       System.out.println("result inserted "+result);
    }
}
