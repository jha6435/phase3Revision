package com.krishna.constructorInjection;

public class Address {
	
	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
	
	

}
