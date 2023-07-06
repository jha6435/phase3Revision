package com.krishna.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	private String uName;
	private String uGender;
	private int uAge;
	private String uCountry;
	private String uEmail;
	private String uPassword;
	private String uLoginId;
	private String uDateAdded;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uId, String uName, String uGender, int uAge, String uCountry, String uEmail, String uPassword,
			String uLoginId, String uDateAdded) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uGender = uGender;
		this.uAge = uAge;
		this.uCountry = uCountry;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.uLoginId = uLoginId;
		this.uDateAdded = uDateAdded;
	}

	public User(String uLoginId,String uPassword) {
		super();
		this.uLoginId = uLoginId;
		this.uPassword = uPassword;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuGender() {
		return uGender;
	}

	public void setuGender(String uGender) {
		this.uGender = uGender;
	}

	public int getuAge() {
		return uAge;
	}

	public void setuAge(int uAge) {
		this.uAge = uAge;
	}

	public String getuCountry() {
		return uCountry;
	}

	public void setuCountry(String uCountry) {
		this.uCountry = uCountry;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuLoginId() {
		return uLoginId;
	}

	public void setuLoginId(String uLoginId) {
		this.uLoginId = uLoginId;
	}

	public String getuDateAdded() {
		return uDateAdded;
	}

	public void setuDateAdded(String uDateAdded) {
		this.uDateAdded = uDateAdded;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uGender=" + uGender + ", uAge=" + uAge + ", uCountry="
				+ uCountry + ", uEmail=" + uEmail + ", uPassword=" + uPassword + ", uLoginId=" + uLoginId
				+ ", uDateAdded=" + uDateAdded + "]";
	}
	
	


	

}
