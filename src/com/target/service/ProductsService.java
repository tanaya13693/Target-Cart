package com.target.service;

import java.util.List;

import com.target.model.Product;

public interface ProductsService {

	public void addProduct(Product product);
	public List<Product> getProducts();
	public Product findById(long id);
	public void updateProduct(Product product);
}
