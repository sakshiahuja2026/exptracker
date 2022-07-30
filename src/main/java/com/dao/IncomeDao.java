package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.IncomeBean;

@Repository
public class IncomeDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addIncome(IncomeBean income) {
		stmt.update("insert into income(accounttype,amount,userid) values(?,?,?)" ,
				income.getAccountType(),income.getAmount(),income.getUserId());	}


	public List<IncomeBean> listIncome(Integer userId) {
		return stmt.query("select * from income where userId=?" , new BeanPropertyRowMapper<IncomeBean>(IncomeBean.class),new Object[] {userId}); 
	}
}
