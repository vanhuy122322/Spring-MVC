package com.chuvanhuy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chuvanhuy.dao.RelateDAO;
import com.chuvanhuy.model.Related;


@Service
public class RelateServiceImpl implements RelateService {
	@Autowired
	private RelateDAO relateDAO;
	public void setRelateDAO(RelateDAO relateDAO) {
		this.relateDAO = relateDAO;
	}
	@Transactional
	public List<Related> listRelate(int id_product){
		return this.relateDAO.listRelate(id_product);
		
	}
}
