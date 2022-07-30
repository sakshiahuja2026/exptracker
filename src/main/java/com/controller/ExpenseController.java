package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ExpenseBean;
import com.dao.ExpenseDao;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseDao expenseDao;
	
	@GetMapping("/addexpense")
	public String addexpense() {
		return "AddExpense";
	}
	@PostMapping("/saveexpense")
	public String addExpense(ExpenseBean expenseBean) {
		expenseDao.addExpense(expenseBean);
		return "Home";
	}
	
}
