package com.krishna.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_orm")
public class Employee {
	
	@Id
	private int eid;
	private String  ename;
	private String ecity;
	
	public Employee() {}

	public Employee(int eid, String ename, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
	}
	
	
	

}
