package com.krishna.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Value("Rupesh kumar")
	private String studentName;
	@Value("Faridabad")
	private String city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	

}