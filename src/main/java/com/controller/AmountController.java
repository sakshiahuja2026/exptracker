package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.AmountBean;
import com.bean.ExpenseBean;
import com.bean.UserBean;
import com.dao.AmountDao;
import com.dao.ExpenseDao;

@Controller
public class AmountController {
	@Autowired
	AmountDao amountDao;
	@Autowired
	ExpenseDao expenseDao;

	@GetMapping("/addamount")
	public String addamount() {
		return "AddAmount";
	}

	@PostMapping("/saveamount")
	public String addAmount(AmountBean amountBean) {
		amountDao.addAmount(amountBean);
		return "Home";
	}

	@GetMapping("/listamount")
	public String listAmount(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<AmountBean> amount = amountDao.listAmount(user.getUserId());
		model.addAttribute("amount", amount);

		List<AmountBean> balance = amountDao.totalBalance(user.getUserId());
		model.addAttribute("balance", balance);

		List<ExpenseBean> expense = expenseDao.totalExpense(user.getUserId());
		model.addAttribute("expense", expense);
		return "ListAmount";
	}

	@GetMapping("/showbalance")
	public String showbalance(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		
		List<AmountBean> balance = amountDao.totalBalance(user.getUserId());
		model.addAttribute("balance", balance);
		
		List<ExpenseBean> expense = expenseDao.totalExpense(user.getUserId());
		model.addAttribute("expense", expense);
		
		
		return "AvailableBalance";
	}
	
	
}