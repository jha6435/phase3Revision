package com.krishna.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.main.entity.Food;
import com.krishna.main.repository.FoodRepo;
@Service
public class FoodServiceImpl implements FoodService{

	@Autowired
	private FoodRepo FoodRepository;
	
	
	
	public FoodRepo getFoodRepository() {
		return FoodRepository;
	}

	public void setFoodRepository(FoodRepo foodRepository) {
		FoodRepository = foodRepository;
	}

	@Override
	public void addFood(Food food) {
		FoodRepository.save(food);
		
	}

	@Override
	public void updateFood(Food food, int food_id) {
		Food food2 = FoodRepository.findById(food_id).get();
		food2.setFood_name(food.getFood_name());
		food2.setFood_price(food.getFood_price());
		FoodRepository.save(food2);
	}

	@Override
	public void deleteFood(int food_id) {
		FoodRepository.deleteById(food_id);
		
	}

	@Override
	public Food getFoodById(int food_id) {
		
		return FoodRepository.findById(food_id).get();
		
	}

	@Override
	public List<Food> getAllFood() {
		
		return FoodRepository.findAll();
	}

}
