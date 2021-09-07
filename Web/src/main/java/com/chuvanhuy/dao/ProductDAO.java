package com.chuvanhuy.dao;

import java.util.List;


import com.chuvanhuy.model.Product;


public interface ProductDAO {
	public List<Product> listProductsdealsofweek();
	public List<Product> listProductsfeatureofweek();
	public List<Product> listProductsnewarrival();
	public List<Product> listProductsnewarrivalscover();
	public List<Product> listProductsbestseller();
	public List<Product> listProductsviewe();
	public List<Product> listProductstrend();

	public Product getProductById(int id);
	public List<Product> listAllProduct();
	
	public void DeleteProduct(int id);
	public Product Edit(int id);

	public void AddProduct(Product p);
	
	
	


}
