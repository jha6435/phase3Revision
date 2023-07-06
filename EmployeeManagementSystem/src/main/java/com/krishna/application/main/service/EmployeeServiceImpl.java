package com.krishna.application.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.application.main.entity.Employee;
import com.krishna.application.main.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

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
	public Employee getEmployeebyid(int empid) {
		
		return empRepo.findById(empid).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public void updateEmployee(Employee emp, int empid) {
		empRepo.save(emp);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		empRepo.deleteById(empid);
		
	}

}
