package com.krishna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.model.Customer;
import com.krishna.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository custRepo;
	

	public CustomerRepository getCustRepo() {
		return custRepo;
	}


	public void setCustRepo(CustomerRepository custRepo) {
		this.custRepo = custRepo;
	}


	@Override
	public Customer addComplain(Customer customer) {
		
		return custRepo.save(customer);
	}


	@Override
	public List<Customer> getAllComplain() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	
	
	
}
