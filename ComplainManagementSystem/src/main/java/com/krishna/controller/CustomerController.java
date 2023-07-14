package com.krishna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.krishna.model.Customer;
import com.krishna.service.CustomerServiceImpl;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiceImpl custService;

	public CustomerServiceImpl getCustService() {
		return custService;
	}

	public void setCustService(CustomerServiceImpl custService) {
		this.custService = custService;
	}
	
	@PostMapping("/addComplain")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer cutomer){
		return new ResponseEntity<Customer>(custService.addComplain(cutomer), HttpStatus.CREATED);
	}
	
	@GetMapping("/AbcHome")
	public String home() {
	
		return "complainPage";
	}
	
	@GetMapping("/allComplain")
	public ResponseEntity<List<Customer>> getAllComplain(){
		return new ResponseEntity<List<Customer>>(custService.getAllComplain(), HttpStatus.OK);
	}
	
}
