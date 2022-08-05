package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.AmountBean;
import com.bean.CategoryBean;
import com.bean.ExpenseBean;
import com.bean.AmountBean;

@Repository
public class AmountDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addAmount(AmountBean amount) {
		stmt.update("insert into amount(accounttype,amount,userid,cardno,upiid) values(?,?,?,?,?)" ,
				amount.getAccountType(),amount.getAmount(),amount.getUserId(), amount.getCardNo(), amount.getUpiId());	}

	public List<AmountBean> listAmount(Integer userId) {
		return stmt.query("select * from amount where userId=?" ,
				new BeanPropertyRowMapper<AmountBean>(AmountBean.class),new Object[] {userId}); 
	}

	public List<AmountBean> listAmountType(Integer userId) {
		return stmt.query("select * from amount where userId=?",
				new BeanPropertyRowMapper<AmountBean>(AmountBean.class), new Object[] { userId });
	}

	public List<AmountBean> totalBalance(Integer userId) {
		return stmt.query("select sum(amount) as amount from amount where userid=?",
				new BeanPropertyRowMapper<AmountBean>(AmountBean.class),new Object[] {userId});
	}

	

}