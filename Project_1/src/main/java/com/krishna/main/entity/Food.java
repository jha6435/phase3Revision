package com.krishna.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int food_id;
	private String food_name;
	private double food_price;
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(int food_id, String food_name, double food_price) {
		super();
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_price = food_price;
	}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public double getFood_price() {
		return food_price;
	}

	public void setFood_price(double food_price) {
		this.food_price = food_price;
	}

	@Override
	public String toString() {
		return "Food [food_id=" + food_id + ", food_name=" + food_name + ", food_price=" + food_price + "]";
	}
	
	
	
}
