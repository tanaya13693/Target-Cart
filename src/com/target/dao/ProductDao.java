package com.target.dao;

import java.util.List;

import com.target.model.Product;

public interface ProductDao {
	public void addProduct(Product product);
	public List<Product> getProducts();
	public Product findById(long id);
	public void updateProduct(Product product);
	
}
