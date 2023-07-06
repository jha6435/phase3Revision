package com.krishna.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.entity.Product;
import com.krishna.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prodRepo;
	
	public Product addProduct(Product product) {
		return prodRepo.save(product);
	}
	public void updateProduct(Product product,int pId) {
		
		if(prodRepo.findById(pId).isPresent()) {
			Product newProduct = prodRepo.findById(pId).get();
			
			newProduct.setpName(product.getpName());
			newProduct.setpDescription(product.getpDescription());
			newProduct.setpCategory(product.getpCategory());
			newProduct.setpPrice(product.getpPrice());
			newProduct.setpQuantity(product.getpQuantity());
			newProduct.setpImage(product.getpImage());
			prodRepo.save(newProduct);
		}
		else {
			System.out.println("product id not found please try again");
		}
	}
	
	public void deleteProduct(int pId) {
	
		if(prodRepo.findById(pId).isPresent()) {
		
			prodRepo.deleteById(pId);
		}
		else {
			System.out.println("product not found");
		}
	}
}
