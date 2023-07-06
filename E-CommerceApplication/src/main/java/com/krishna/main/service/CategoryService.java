package com.krishna.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.main.model.Category;
import com.krishna.main.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository catRepo;

	public CategoryRepository getCatRepo() {
		return catRepo;
	}

	public void setCatRepo(CategoryRepository catRepo) {
		this.catRepo = catRepo;
	}
	
	public List<Category> getAllCategory(){
	
	return catRepo.findAll();
}

	public void addCategory(Category category) {
	catRepo.save(category);
}
	
	public void removeCategoryById(int id) {
		catRepo.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id){
		return catRepo.findById(id);
	}
}