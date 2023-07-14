package com.krishna.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_complain")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="complaint_no")
	private int complaintNo;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_description")
	private String complainDescription;
	@Column(name="customer_contact_no")
	private long customerContactNo;
	@Column(name="customer_Location")
	private String customerLocation;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String complainDescription, long customerContactNo, String customerLocation) {
		super();
		this.customerName = customerName;
		this.complainDescription = complainDescription;
		this.customerContactNo = customerContactNo;
		this.customerLocation = customerLocation;
	}

	public int getComplaintNo() {
		return complaintNo;
	}

	public void setComplaintNo(int complaintNo) {
		this.complaintNo = complaintNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getComplainDescription() {
		return complainDescription;
	}

	public void setComplainDescription(String complainDescription) {
		this.complainDescription = complainDescription;
	}

	public long getCustomerContactNo() {
		return customerContactNo;
	}

	public void setCustomerContactNo(long customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	@Override
	public String toString() {
		return "Customer [complaintNo=" + complaintNo + ", customerName=" + customerName + ", complainDescription="
				+ complainDescription + ", customerContactNo=" + customerContactNo + ", customerLocation="
				+ customerLocation + "]";
	}

	
	
	
}
