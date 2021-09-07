package com.chuvanhuy.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.chuvanhuy.dao.UserDAO;
import com.chuvanhuy.model.Users;

@Service
public class UserServiceImpl implements UserService{
		   @Autowired
		   private UserDAO userDAO;
			public void setUserDAO(UserDAO userDAO) {
				this.userDAO = userDAO;
			}
		   @Transactional
		   public void AddAccount(Users user) {
			   user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(20)));
			   this.userDAO.AddAccount(user);
		   }
		   public boolean CheckAccount(Users user) {
			   String pass=user.getPassword();
			   
			   user= userDAO.GetUserByAcc(user);
			   if(user !=null) {
				   if(BCrypt.checkpw(pass, user.getPassword())) {
					   return true;
				   
			   }
			   else {
				   return false;
			   }}
			return false;
		   }
		   public Users CheckCreat(Users user) {
			   String username=user.getPassword();
			   if(this.userDAO.GetUserByUsername(username)==null) {
				   return user;
			   }
			return null;
		   }
		   
		}

