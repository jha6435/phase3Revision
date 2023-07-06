package com.krishna.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.krishna.main.dto.ProductDto;
import com.krishna.main.model.Category;
import com.krishna.main.service.CategoryService;
import com.krishna.main.service.ProductService;

@Controller
public class AdminController {
	
	@Autowired
	private CategoryService catService;
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/admin")
	public String adminHome() {
		return "adminHome";
	}

	@GetMapping("/admin/categories")
	public String getCat(Model model) {
		model.addAttribute("categories", catService.getAllCategory());
		return "categories";
	}
	
	@GetMapping("/admin/categories/add")
	public String catAdd(Model model) {
		model.addAttribute("category", new Category());
		return "categoriesAdd";
	}
	
	@PostMapping("/admin/categories/add")
	public String postCatAdd(@ModelAttribute ("catetory") Category category) {
		catService.addCategory(category);
		return "redirect:/admin/categories";
	}
	
	@GetMapping("/admin/categories/delete/{id}")
	public String deleteCat(@PathVariable int id) {
		catService.removeCategoryById(id);
		return "redirect:/admin/categories";
	}
	
	@GetMapping("/admin/categories/update/{id}")
	public String updateCat(@PathVariable int id, Model model) {
		Optional<Category> category = catService.getCategoryById(id);
		
		if(category.isPresent()) {
			model.addAttribute("category", category.get());
			return "categoriesAdd";
		}
		else {
			return"404 page not found";
		}
	}		
	
	@GetMapping("/admin/products")
	public String Products(Model model) {
		model.addAttribute("products", prodService.getAllProduct());
		return "products";
	}

	@GetMapping("/admin/products/add")
	public String productAddGet(Model model) {
		model.addAttribute("productDto", new ProductDto());
		model.addAttribute("categories", catService.getAllCategory());
		return "productsAdd";
	}
	
	
	
}
