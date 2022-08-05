package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ExpenseBean;
import com.bean.AmountBean;

@Repository
public class ExpenseDao {

	@Autowired
	JdbcTemplate stmt;

	public void addExpense(ExpenseBean expenseBean) {
		stmt.update("insert into expense(category,date,time,description,amount,typeofpayment,userid,subcategoryname) values(?,?,?,?,?,?,?,?)",
				expenseBean.getCategory(),expenseBean.getDate(),expenseBean.getTime(),
				expenseBean.getDescription(),expenseBean.getAmount(),
				expenseBean.getTypeofpayment(),expenseBean.getUserId(),expenseBean.getSubCategoryName());
		
	}

	public List<ExpenseBean> listExpense(Integer userId) {
		return stmt.query("select * from expense where userId=?" , new BeanPropertyRowMapper<ExpenseBean>(ExpenseBean.class),new Object[] {userId}); 
	}
	public void deleteexpense(int expenseId) {
		stmt.update("delete from expense where expenseid=?",expenseId);
		
	}
	public void updateexpense(ExpenseBean expenseBean) {
		stmt.update("update expense set category=?,date=?,time=?,description=?,amount=?typeofpayment=? where expenseid=?",
				expenseBean.getCategory(),expenseBean.getDate(),expenseBean.getTime(),
				expenseBean.getDescription(),expenseBean.getAmount(),expenseBean.getTypeofpayment());
	}

	public ExpenseBean getExpenseById(int expenseId) {
		ExpenseBean expense = stmt.queryForObject("select * from expense where expenseId=?",new BeanPropertyRowMapper<ExpenseBean>(ExpenseBean.class),new Object[] {expenseId});
		return expense;
	}	
	public List<ExpenseBean> totalExpense(Integer userId) {
		return stmt.query("select sum(amount) as expense from amount where userid=?",new BeanPropertyRowMapper<ExpenseBean>(ExpenseBean.class),new Object[] {userId});
		
	}
}