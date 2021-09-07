package com.chuvanhuy.dao;


 


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.chuvanhuy.model.Product;
import com.chuvanhuy.model.Users;
 

@Repository
public class UserDAOImpl implements UserDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
    public void AddAccount(Users user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	        logger.info("User loaded successfully, User details=" + user);
	       
    }
	public boolean CheckAccount(Users user) {
		// TODO Auto-generated method stub
		return false;
	}
	public Users GetUserByAcc(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	public Users GetUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}