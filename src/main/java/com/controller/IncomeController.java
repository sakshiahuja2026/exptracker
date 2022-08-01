package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.IncomeBean;
import com.bean.UserBean;
import com.dao.IncomeDao;

@Controller
public class IncomeController {
	@Autowired
	IncomeDao incomeDao;

	@GetMapping("/addincome")
	public String addincome() {
		return "AddIncome";
	}

	@PostMapping("/saveincome")
	public String addIncome(IncomeBean incomeBean) {
		incomeDao.addIncome(incomeBean);
		return "Home";
	}

	@GetMapping("/listincome")
	public String listIncome(HttpSession session, Model model) {
		UserBean user = (UserBean) session.getAttribute("user");
		List<IncomeBean> income = incomeDao.listIncome(user.getUserId());
		model.addAttribute("income", income);
		return "ListIncome";
	}
}
