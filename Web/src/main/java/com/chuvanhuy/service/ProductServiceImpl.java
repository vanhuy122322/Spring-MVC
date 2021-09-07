package com.chuvanhuy.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.chuvanhuy.dao.ProductDAO;
import com.chuvanhuy.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;
	private Object sessionFactory;
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	@Transactional
	public List<Product> listProductsdealsofweek() {
		return this.productDAO.listProductsdealsofweek();
	}
	@Transactional
	public List<Product> listProductsfeatureofweek() {
		return this.productDAO.listProductsfeatureofweek();
	}
	@Transactional
	public List<Product> listProductsnewarrival() {
		return this.productDAO.listProductsnewarrival();
	}
	@Transactional
	public List<Product> listProductsnewarrivalscover() {
		return this.productDAO.listProductsnewarrivalscover();
	}
	@Transactional
	public List<Product> listProductsbestseller() {
		return this.productDAO.listProductsbestseller();
	}

	@Transactional
	public List<Product> listProductstrend() {
		return this.productDAO.listProductstrend();
	}
	@Transactional
	public List<Product> listProductsviewe() {
		return this.productDAO.listProductsviewe();
	}
	@Transactional
	public Product getProductById(int id) {
		return this.productDAO.getProductById(id);
	}
	@Transactional
	public List<Product> listAllProduct(){
		return this.productDAO.listAllProduct();
	}
	
	@Transactional
	public void DeleteProduct(int id){
		this.productDAO.DeleteProduct(id);
	}
	@Transactional
	public Product Edit(int id) {
		return this.productDAO.Edit(id);
		
		
	}
	@Override
	public void AddProduct(Product p) {
		this.productDAO.AddProduct(p);
	}
	
	
	
	
}