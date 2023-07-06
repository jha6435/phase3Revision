package com.krishna.constructorInjection;

public class Person {
	
	private int personid;
	private String personName;
	private Address address;
	
	public Person(int personid, String personName, Address address) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + ", address=" + address + "]";
	}


	}
	
	


