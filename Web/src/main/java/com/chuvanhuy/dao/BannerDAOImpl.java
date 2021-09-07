package com.chuvanhuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

import com.chuvanhuy.model.Banner;








@Repository
public class BannerDAOImpl implements BannerDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(BannerDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Banner> listBanner() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Banner> banner = session.createQuery("from Banner ").list();
		for (Banner p : banner) {
			logger.info("Products List::" + p);
		}
		return banner;
	}
	@SuppressWarnings("unchecked")
	public List<Banner> listBannertop() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Banner> bannertop = session.createQuery("from Banner P where type=1 ").list();
		for (Banner p : bannertop) {
			logger.info("Products List::" + p);
		}
		return bannertop;
	}
	}

