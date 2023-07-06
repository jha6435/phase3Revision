package com.krishna.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	@Autowired
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	

}
