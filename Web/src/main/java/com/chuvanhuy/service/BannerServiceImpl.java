package com.chuvanhuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.chuvanhuy.dao.BannerDAO;
import com.chuvanhuy.model.Banner;


public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerDAO bannerDAO;
	public void setBannerDAO(BannerDAO bannerDAO) {
		this.bannerDAO = bannerDAO;
	}
	@Transactional
	public List<Banner> listBanner() {
		return this.bannerDAO.listBanner();
	}
	@Transactional
	public List<Banner> listBannertop() {
		return this.bannerDAO.listBannertop();
	}
}
