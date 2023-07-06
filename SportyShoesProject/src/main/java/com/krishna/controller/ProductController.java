package com.krishna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.entity.Product;
import com.krishna.service.ProductService;

@RestController
@RequestMapping("/SprotyShoesProject/")
public class ProductController {

	@Autowired
	private ProductService prodService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(prodService.addProduct(product), 
				HttpStatus.CREATED);
	}
	
	@PutMapping("/updateProduct/{pId}")
	public ResponseEntity<String> updateProduct(@RequestBody Product product,@PathVariable int pId){
		prodService.updateProduct(product, pId);
		return new ResponseEntity<String>("Product updated", HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteProduct/{pId}")
	public void deleteProduct(@PathVariable int pId) {
		prodService.deleteProduct(pId);
	}
}
