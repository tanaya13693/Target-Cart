package com.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.target.dao.ProductDao;
import com.target.model.Product;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setRecordDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	@Override
	public List<Product> getProducts() {		
		return productDao.getProducts();
	}

	@Override
	public Product findById(long id) {		
		return productDao.findById(id);
	}

	@Override
	public void updateProduct(Product product) {
		productDao.updateProduct(product);	
	}


	
}
