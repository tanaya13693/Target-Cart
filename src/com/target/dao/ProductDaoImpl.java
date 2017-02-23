package com.target.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.target.model.Price;
import com.target.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private static List<Product> products; 
	
	static{
		products = populateDummyProducts();
	}
	
	@Override
	public void addProduct(Product product) {
		products.add(product);		
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public Product findById(long id) {
		for(Product product: products){
			if(product.getId() == id){
				return product;
			}
		}
		return null;
	}

	@Override
	public void updateProduct(Product product) {
		int index = products.indexOf(product);
		products.set(index, product);
		
	}
	
	private static List<Product> populateDummyProducts(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(15117729, "The davince Code", new Price(45.89,"USD")));
		products.add(new Product(15117733, "Java", new Price(50,"USD")));
		products.add(new Product(15117735, "Inferno", new Price(125.22,"USD")));
		products.add(new Product(15117738, "Harry Potter 1", new Price(100.10,"USD")));

		return products;
	}
	
}
