package com.chuvanhuy.service;

import com.chuvanhuy.model.Users;

public interface UserService {
	public void AddAccount(Users user);
	public boolean CheckAccount(Users user);
	public Users CheckCreat(Users user);
	
	}

