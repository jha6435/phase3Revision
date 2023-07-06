package com.krishna.removingXml;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {
	
	private Address address;
	
	
	
	
	public Student() {
		super();
		
	}




	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public Student(Address address) {
		super();
		this.address = address;
	}




	public void study() {
		
		this.address.display();
		System.out.println("student is reading");
	}

}
