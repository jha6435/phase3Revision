package com.krishna.application.main.service;

import java.util.List;

import com.krishna.application.main.entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public Employee getEmployeebyid(int empid);
	public List<Employee> getAllEmployee();
	public void updateEmployee(Employee emp,int empid);
	public void deleteEmployee(int empid);

}
