package com.krishna.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.krishna.main.entity.Employee;
import com.krishna.main.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	
	
	public EmployeeRepository getEmpRepo() {
		return empRepo;
	}



	public void setEmpRepo(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}



	@Override
	public void addEmployee(Employee emp) {
		
		empRepo.save(emp);
	}



	@Override
	public Employee updateEmployee(Employee emp, int id) {
		
		return empRepo.save(emp);
	}



	@Override
	public void deleteEmployee(int id) {
		empRepo.deleteById(id);		
	}



	@Override
	public List<Employee> allEmployee() {
		
		return empRepo.findAll();
	}


	
	@Override
	public Employee searchById(int id) {
		return empRepo.findById(id).get();
	}
	

}
