package com.krishna.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.main.entity.Employee;
import com.krishna.main.service.EmployeeServiceImpl;

@RestController
public class EmpController {

	@Autowired
	private EmployeeServiceImpl service;
	
	@RequestMapping("/check")
	public String myMethod() {
		return "my method working";
	}
	
	//@RequestMapping(method = RequestMethod.POST,value="/addEmp")
	@PostMapping("/addEmp")
	public void add(@RequestBody Employee emp) {
		service.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/addEmp/{id}")
	public Employee updateEmp(@RequestBody Employee emp,@PathVariable int id) {
		
		return service.updateEmployee(emp, id);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/emp/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/allEmp")
	public List<Employee> allEmployee(){
		return service.allEmployee();
	}
	
	@GetMapping("/emp/{id}")
	public Employee searchById(@PathVariable int id) {
		return service.searchById(id);
	}
}
