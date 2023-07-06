package com.krishna.ph3Class1_20_3_23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	
    	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    		   
    	Hello h=(Hello) context.getBean("print");
    	h.print();
    	
    	Student s=(Student)context.getBean("studobj");
    	
    	System.out.println("id is :"+s.getId());
    	System.out.println("name is :"+s.getName());
    	
    	System.out.println(s.getId2());
    	System.out.println(s.getName2());
    	System.out.println(s.getPassport());
    
    	Passport p=(Passport) context.getBean("passid");
    	System.out.println("passport no is : "+p.getPassport());
    }
}
