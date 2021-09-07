package com.chuvanhuy.model;

public class Cart {
	private int quanty;
	private double Total_price;
	private Product product;
	
	public Cart() {
		
	}
	
	public Cart(int quanty, double total_price, Product product) {
		this.quanty = quanty;
		Total_price = total_price;
		this.product = product;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getTotal_price() {
		return Total_price;
	}
	public void setTotal_price(double total_price) {
		Total_price = total_price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}