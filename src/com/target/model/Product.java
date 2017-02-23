package com.target.model;

public class Product {

	private long id;		
	private String name;	
	private Price currentPrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String name, Price currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Price getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Price currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
}
