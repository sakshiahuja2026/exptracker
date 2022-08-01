package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CategoryBean;
import com.bean.ExpenseBean;
import com.bean.IncomeBean;
import com.bean.UserBean;
import com.dao.CategoryDao;
import com.dao.ExpenseDao;
import com.dao.IncomeDao;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseDao expenseDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	IncomeDao incomeDao;
	
	@GetMapping("/addexpense")
	public String addexpense(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<CategoryBean> category = categoryDao.listCategory(user.getUserId());	
		model.addAttribute("category", category);
		List<IncomeBean> incomeType = incomeDao.listIncomeType(user.getUserId());	
		model.addAttribute("incomeType", incomeType);
		return "AddExpense";
	}
	
	@PostMapping("/addexpense")
	public String addExpense(ExpenseBean expenseBean) {
		expenseDao.addExpense(expenseBean);
		return "Home";
	}
	
	@GetMapping("/listexpense")
	public String listExpense(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<ExpenseBean> expense = expenseDao.listExpense(user.getUserId());
		model.addAttribute("expense", expense);
		return "ListExpense";
	}
	
}