package com.chuvanhuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.chuvanhuy.model.Product;
import com.chuvanhuy.model.Related;

@Repository
public class RelateDAOImpl implements RelateDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public List<Related> listRelate(int id_product){
	    	Session session = this.sessionFactory.getCurrentSession();
	        Product p = (Product) session.load(Product.class, new Integer(id_product));
	        List<Related> list_related= p.getProduct_re();
			for (Related b : list_related) {
				logger.info("Related List::" + b);
			}
			return list_related;
		}
}
