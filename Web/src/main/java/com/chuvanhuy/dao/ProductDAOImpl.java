package com.chuvanhuy.dao;


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.chuvanhuy.model.Product;


@Repository
public class ProductDAOImpl implements ProductDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsdealsofweek() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producthotdeals = session.createQuery("from Product P where P.hot_deal = true").list();
		for (Product p : producthotdeals) {
			logger.info("Products List::" + p);
		}
		return producthotdeals;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsfeatureofweek() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productfeatureofweek = session.createQuery("from Product P where P.hot_new = true").list();
		for (Product p : productfeatureofweek) {
			logger.info("Products List::" + p);
		}
	return productfeatureofweek;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsnewarrival() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productnewarrivals = session.createQuery("from Product P where P.cover = true").list();
		for (Product p : productnewarrivals) {
			logger.info("Products List::" + p);
		}
	return productnewarrivals;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsnewarrivalscover() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productnewarrivalscover = session.createQuery("from Product P where P.latest_review=true").list();
		for (Product p : productnewarrivalscover) {
			logger.info("Products List::" + p);
		}
	return productnewarrivalscover;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsbestseller() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productbestseller = session.createQuery("from Product P where P.hot_best=true").list();
		for (Product p : productbestseller) {
			logger.info("Products List::" + p);
		}
	return productbestseller;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsviewe() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productviewe = session.createQuery("from Product P where id_category=10").list();
		for (Product p : productviewe) {
			logger.info("Products List::" + p);
		}
	return productviewe;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductstrend() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producttrend = session.createQuery("from Product P where P.trend=true and hot_deal=true").list();
		for (Product p : producttrend) {
			logger.info("Products List::" + p);
		}
	return producttrend;
	}
	
    public Product getProductById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        @SuppressWarnings("deprecation")
        Product p = (Product) session.load(Product.class, new Integer(id));
        logger.info("Product loaded successfully, Product details=" + p);
        return p;
    }
    @SuppressWarnings("unchecked")
	public List<Product> listAllProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productall = session.createQuery("from Product").list();
		for (Product p : productall) {
			logger.info("Products List::" + p);
		}
	return productall;
	}
    @SuppressWarnings("unchecked")
	public void DeleteProduct(int id) {
    	Session session = this.sessionFactory.getCurrentSession();
        Product p = (Product) session.load(Product.class, new Integer(id));
        if(p!=null ) {
        	session.delete(id);
        }
        logger.info("Product loaded successfully, Product details=" + p);
        
        }
    @SuppressWarnings("unchecked")
	public Product Edit(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    @SuppressWarnings("unchecked")
	public void AddProduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Product loaded successfully, Product details=" + p);
	}
	
	
   
   

}
