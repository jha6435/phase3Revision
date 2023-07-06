package com.krishna.main.service;

import java.util.List;

import com.krishna.main.entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp, int id);
	public void deleteEmployee(int id);
	public List<Employee> allEmployee();
	public Employee searchById(int id);

}
