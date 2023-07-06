package com.krishna.main.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Toy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int toy_id;
	private String toy_name;
	private float toy_price;
	public int getToy_id() {
		return toy_id;
	}
	public void setToy_id(int toy_id) {
		this.toy_id = toy_id;
	}
	public String getToy_name() {
		return toy_name;
	}
	public void setToy_name(String toy_name) {
		this.toy_name = toy_name;
	}
	public float getToy_price() {
		return toy_price;
	}
	public void setToy_price(float toy_price) {
		this.toy_price = toy_price;
	}
	@Override
	public String toString() {
		return "Toy [toy_id=" + toy_id + ", toy_name=" + toy_name + ", toy_price=" + toy_price + "]";
	}
	
	
}
