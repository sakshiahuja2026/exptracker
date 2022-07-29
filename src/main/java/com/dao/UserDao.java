package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate stmt;

	public void addUser(UserBean user) {
		stmt.update("insert into signup(firstname,lastname,email,password,gender,usertype) values (?,?,?,?,?,?)",
				user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getGender(),
				user.getUserType());
	}
}
