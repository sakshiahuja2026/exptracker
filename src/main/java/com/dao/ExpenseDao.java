package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ExpenseBean;
import com.bean.IncomeBean;

@Repository
public class ExpenseDao {

	@Autowired
	JdbcTemplate stmt;

	public void addExpense(ExpenseBean expenseBean) {
		stmt.update("insert into expense(category,date,time,description,amount,typeofpayment,userid) values(?,?,?,?,?,?,?)",
				expenseBean.getCategory(),expenseBean.getDate(),expenseBean.getTime(),
				expenseBean.getDescription(),expenseBean.getAmount(),
				expenseBean.getTypeofpayment(),expenseBean.getUserId());
		
	}

	public List<ExpenseBean> listExpense(Integer userId) {
		return stmt.query("select * from expense where userId=?" , new BeanPropertyRowMapper<ExpenseBean>(ExpenseBean.class),new Object[] {userId}); 
	}
	
		
	
}