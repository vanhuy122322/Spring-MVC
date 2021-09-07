package com.chuvanhuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.chuvanhuy.dao.CategoryDAO;
import com.chuvanhuy.model.Category;



public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	@Transactional
	public List<Category> listCategory() {
		return this.categoryDAO.listCategory();
	}
}
