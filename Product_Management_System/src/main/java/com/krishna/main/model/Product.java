package com.krishna.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Entity
@Data

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String pname;
	private double pprice;
	private String pbrand;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, double pprice, String pbrand) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pbrand = pbrand;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pprice=" + pprice + ", pbrand=" + pbrand + "]";
	}
	
	
	
}
