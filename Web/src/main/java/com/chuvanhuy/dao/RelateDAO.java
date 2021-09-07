package com.chuvanhuy.dao;

import java.util.List;


import com.chuvanhuy.model.Related;

public interface RelateDAO {
	public List<Related> listRelate(int id_product);
}
