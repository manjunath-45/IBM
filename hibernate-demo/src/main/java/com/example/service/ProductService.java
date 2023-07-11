package com.example.service;

import java.util.List;


import com.example.model.Product;

public interface ProductService {

	public Product createProduct(Product product);
	
	public List<Product> getAllProduct();

	public Product getAlProduct(int productId);
	
	public List<Product> getProductByName(String productName);
}
