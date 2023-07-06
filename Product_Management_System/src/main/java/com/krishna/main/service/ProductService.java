package com.krishna.main.service;

import java.util.List;

import com.krishna.main.model.Product;

public interface ProductService {

	public Product save(Product product);
	public List<Product> getAllProduct();
	public Product searchProductById(long id);
	public Product updateProduct(Product product,long id);
	public void deleteProduct(long id);
}
