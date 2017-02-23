package com.target.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.Product;
import com.target.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping(value="/products/list", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProducts() {	
		//System.out.println("Point1");
		return new ResponseEntity<List<Product>>(productsService.getProducts(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProduct(@PathVariable("id") long id) {	
		Product product = productsService.findById(id);
		if(product == null){
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND); 
		}
		else
			return new ResponseEntity<Product>(productsService.findById(id),HttpStatus.OK);
	}
		
	@RequestMapping(value="/products/{id}", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product newProduct){
		
		Product product = productsService.findById(id);
		if(product == null){
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}else{
			product.setName(newProduct.getName());
			product.setCurrentPrice(newProduct.getCurrentPrice());
			productsService.updateProduct(product);			
			return new ResponseEntity<Product>(HttpStatus.OK);
		}
	}
}
