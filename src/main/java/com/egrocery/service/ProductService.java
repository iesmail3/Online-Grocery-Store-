package com.egrocery.service;

import java.util.List;

import com.egrocery.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts(); 
	
	Product getProductById(int id); 
	
	void addProduct(Product product); 
	
	void editProduct(Product product); 
	
    void deleteProduct(Product product); 
}
