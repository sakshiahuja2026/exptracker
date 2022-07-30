package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ExpenseBean;

@Repository
public class ExpenseDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addExpense(ExpenseBean expense) {
		stmt.update("insert into expense");
	}
}
