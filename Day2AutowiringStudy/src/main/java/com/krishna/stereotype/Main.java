package com.krishna.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
ApplicationContext context=new ClassPathXmlApplicationContext("com/krishna/stereotype/config2.xml");
		Student student=(Student) context.getBean("stud");
		System.out.println(student);
		
	}

}
