package com.target.model;

public class Price {

	private double value;
	private String currencyCode;
	
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Price(double d, String currencyCode) {
		super();
		this.value = d;
		this.currencyCode = currencyCode;
	}
	
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
