package com.krishna.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.krishna.dao.StudentDaoImpl;
import com.krishna.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "student management system" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");  
        StudentDaoImpl temp = context.getBean("dao",StudentDaoImpl.class);
      
//  JdbcTemplate temp = context.getBean("jdbcTemplate",JdbcTemplate.class);
//  
//  String query="insert into student (id,name,city) values(?,?,?)";
//  
//  int result = temp.update(query, 101,"rupesh","delhi");
//  System.out.println("record inserted : "+ result);
      
        Scanner obj=new Scanner(System.in);
//        System.out.println("enter student id");
//        int id=obj.nextInt();
        System.out.println("enter student name");
        String name=obj.next();
//        System.out.println("enter student city");
//        String city=obj.next();
//        obj.close();
//       
//        Student stud=new Student();
//        stud.setId(id);
//        stud.setName(name);
//        stud.setCity(city);
//        
//        int result=temp.insert(stud);
//       System.out.println(result);
        
//        int ch = temp.change(stud);
//        System.out.println(ch);
//        
//        System.out.println("enter the id you want to delete");
//        int id=obj.nextInt();
//        int delete = temp.delete(id);
//        System.out.println(delete);
//        
//        System.out.println("enter the id whose data you want to print");
//        int id=obj.nextInt();
//        Student s=temp.getStudent(id);
//        System.out.println(s);
  
        
//        List<Student> allStudent = temp.getAllStudent();
//        for(Student s:allStudent)
//        	System.out.println(s);
       
        Student student = temp.getStudent(name);
        
        System.out.println(student);
    }
}
