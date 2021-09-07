package com.chuvanhuy.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.chuvanhuy.model.Category;


@Repository
public class CategoryDAOImpl implements CategoryDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CategoryDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Category> listCategory() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Category> categories = session.createQuery("from Category ").list();
		for (Category p : categories) {
			logger.info("Products List::" + p);
		}
		return categories;
	}
	}
