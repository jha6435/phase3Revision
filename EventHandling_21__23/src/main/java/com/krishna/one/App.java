package com.krishna.one;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     
    	
    	ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	context.start();
    	context.stop();
    	
    }
}
