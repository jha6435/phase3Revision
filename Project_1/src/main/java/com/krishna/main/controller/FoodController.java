package com.krishna.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.main.entity.Food;
import com.krishna.main.service.FoodServiceImpl;

@RestController
public class FoodController {
	
	@Autowired
	private FoodServiceImpl foodService;
	
	@PostMapping("/addFood")
	public  void addFoodItem(@RequestBody Food food) {
				foodService.addFood(food);
	}
	
	@PutMapping("/updateItem/{food_id}")
	public void updateFood(@RequestBody Food food,@PathVariable  int food_id) {
		foodService.updateFood(food, food_id);
	}
	
	@DeleteMapping("/deleteFood/{food_id}")
	public void delete(@PathVariable int food_id) {
		foodService.deleteFood(food_id);
	}

	@GetMapping("/getFood/{food_id}")
	public Food findByFood(@PathVariable int food_id) {
		return foodService.getFoodById(food_id);
	}
	
	@GetMapping("/getMenu")
	public List<Food> findMenu(){
		return foodService.getAllFood();
	}
}
