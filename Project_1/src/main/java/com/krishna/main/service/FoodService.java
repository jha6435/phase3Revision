package com.krishna.main.service;

import java.util.List;

import com.krishna.main.entity.Food;

public interface FoodService {
	
	public void addFood(Food food);
	public void updateFood(Food food,int food_id);
	public void deleteFood(int food_id);
	public Food getFoodById(int food_id);
	public List<Food> getAllFood();

}
