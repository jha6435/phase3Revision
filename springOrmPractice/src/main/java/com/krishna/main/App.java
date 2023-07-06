package com.krishna.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishna.dao.EmployeeDao;
import com.krishna.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("welcome to Employee Management System");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
        EmployeeDao daoObj = context.getBean("empDao",EmployeeDao.class);
        
        Employee emp=new Employee(401, "rajesh pandey", "faridabad");
        int r=daoObj.insert(emp);
        System.out.println("employee added sucessfully: "+ r);
    }
}
