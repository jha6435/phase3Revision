package com.krishna.application.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.application.main.entity.Employee;
import com.krishna.application.main.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService empserv;
	
	@RequestMapping("/working")
	public String test() {
		return "yes your code is completely fine";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employee")
	public void addemp(@RequestBody Employee emp) {
		empserv.addEmployee(emp);
	}

}
