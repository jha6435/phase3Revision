package com.krishna.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.main.exception.ResourceNotFoundException;
import com.krishna.main.model.Product;
import com.krishna.main.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository prodRepo;

	public ProductRepository getProdRepo() {
		return prodRepo;
	}

	public void setProdRepo(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}

	@Override
	public Product save(Product product) {
		
		return prodRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return prodRepo.findAll();
	}

	@Override
	public Product searchProductById(long id) {
		
		 Optional<Product> product = prodRepo.findById(id);
//		 if(product.isPresent()) {
//			 return product.get();
//		 }
//		 else {
//			 throw new ResourceNotFoundException("Product", "Id", id);
//		 }
		 
 return prodRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "Id", id));
	}

	@Override
	public Product updateProduct(Product product, long id) {
		
	Product	presentProduct=prodRepo.findById(id).
			orElseThrow(()-> new ResourceNotFoundException("Product", "Id", id));
		
	presentProduct.setPname(product.getPname());
	presentProduct.setPbrand(product.getPbrand());
	presentProduct.setPprice(product.getPprice());
	prodRepo.save(presentProduct);	
	return presentProduct;
	}

	@Override
	public void deleteProduct(long id) {
 prodRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Product", "Id", id));
			
		
		prodRepo.deleteById(id);
	}
	
	

}
