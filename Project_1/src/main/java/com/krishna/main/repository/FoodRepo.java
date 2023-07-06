package com.krishna.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.main.entity.Food;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer>{

	
	
}
