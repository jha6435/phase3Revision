package com.krishna.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.main.model.Product;
import com.krishna.main.service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl psImpl;

	public ProductController(ProductServiceImpl psImpl) {
		super();
		this.psImpl = psImpl;
	}
	
//	@PostMapping("/addProduct")
//	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
//		return new ResponseEntity<Product>(psImpl.save(product), HttpStatus.CREATED);
//	}
//	
//		//while using gatter setter
////	public ProductServiceImpl getPsImpl() {
////		return psImpl;
////	}
////
////	public void setPsImpl(ProductServiceImpl psImpl) {
////		this.psImpl = psImpl;
////	}
////	
////	@RequestMapping(method=RequestMethod.POST,value="/addProduct")
////	public Product save(@RequestBody Product product) {
////		return psImpl.save(product);
////	}
//	
//	@RequestMapping(method=RequestMethod.GET,value="/getAllProduct")
//	
//	public List<Product> getAllProduct(){
//		return psImpl.getAllProduct();
//	}
//	
//	@GetMapping("/product/{id}")
//	public ResponseEntity<Product> searchProductById(@PathVariable long id){
//		return new ResponseEntity<Product> (psImpl.searchProductById(id),HttpStatus.FOUND);
//	}
//	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable long id){
//		return new ResponseEntity<Product>(psImpl.updateProduct(product, id), HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<String> deleteProduct(@PathVariable long id){
//		psImpl.deleteProduct(id);
//		return new ResponseEntity<String>("product deleted sucessfully !!!", HttpStatus.OK);
//		
//	}
	
	
		// the above code is without thymeleaf after this line start working on thymeleaf for frontend
	
	
	@GetMapping("/allProduct")
	public String listOfProducts(Model m) {
		m.addAttribute("product",  psImpl.getAllProduct());
		return "products";
	}
	
	//not got expected output so thymeleaf is skipped by mam 
	//remove thymeleaf part and rest code is ok
	
	
	
	
	
}
