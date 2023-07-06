package com.krishna.model;

public class Student {

	private int id;
	private String name;
	private String regNo;
	private String city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String regNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.regNo = regNo;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regNo=" + regNo + ", city=" + city + "]";
	}
	
	
	
	
}
