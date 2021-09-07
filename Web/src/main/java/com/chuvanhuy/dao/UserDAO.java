package com.chuvanhuy.dao;


import org.springframework.jdbc.core.JdbcTemplate;


import com.chuvanhuy.model.Users;

public interface UserDAO {
public static final JdbcTemplate _jdbcTemplate = new JdbcTemplate();
public void AddAccount(Users user);
public Users GetUserByAcc(Users user);
public Users GetUserByUsername(String username);

}