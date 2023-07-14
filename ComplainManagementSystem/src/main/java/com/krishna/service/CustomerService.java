package com.krishna.service;

import java.util.List;

import com.krishna.model.Customer;

public interface CustomerService {
	
	public Customer addComplain(Customer customer);
	public List<Customer> getAllComplain();

}
