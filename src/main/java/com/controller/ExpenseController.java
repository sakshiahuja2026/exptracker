package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.CategoryBean;
import com.bean.ExpenseBean;
import com.bean.AmountBean;
import com.bean.UserBean;
import com.dao.CategoryDao;
import com.dao.ExpenseDao;
import com.dao.AmountDao;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseDao expenseDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	AmountDao amountDao;
	
	@GetMapping("/addexpense")
	public String addexpense(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<CategoryBean> category = categoryDao.listCategory(user.getUserId());	
		model.addAttribute("category", category);
		List<AmountBean> amountType = amountDao.listAmountType(user.getUserId());	
		model.addAttribute("amountType", amountType);
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
	@GetMapping("deleteexpense")
	public String deleteexpense(@RequestParam("expenseId") int expenseId) {
		expenseDao.deleteexpense(expenseId);
	return "ListExpense";
}
	@GetMapping("/editexpense")
	public String saveUpdateOfExpense(@RequestParam("expenseId") int expenseId,Model model) {
		ExpenseBean expense= expenseDao.getExpenseById(expenseId);
		System.out.println(expenseId);
		model.addAttribute("expense", expense);
		return "UpdateExpense";
	}
	
	@PostMapping("/updateexpense")
	public String updateExpense(ExpenseBean expenseBean) {
		System.out.println(expenseBean.getDate());
		System.out.println(expenseBean.getExpenseId());
		expenseDao.updateexpense(expenseBean);
		return "redirect:/ListExpense";
	}
}