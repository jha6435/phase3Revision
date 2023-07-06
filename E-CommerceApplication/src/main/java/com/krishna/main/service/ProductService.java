package com.krishna.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.main.model.Product;
import com.krishna.main.repository.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	ProductRepository prodRepo;
	
	public List<Product> getAllProduct(){
		return prodRepo.findAll();
	}
	
	public void addProduct(Product product) {
		prodRepo.save(product);
	}

	public void removeProductByid(int id) {
		prodRepo.deleteById(id);
	}
	 public Optional<Product> getProductById(int id){
		 return prodRepo.findById(id);
	 }
}
