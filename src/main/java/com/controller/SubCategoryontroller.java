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
import com.bean.SubCategoryBean;
import com.bean.UserBean;
import com.dao.CategoryDao;
import com.dao.SubCategoryDao;

@Controller
public class SubCategoryontroller {

@Autowired
SubCategoryDao subcategoryDao;
@Autowired
CategoryDao categoryDao;

	@GetMapping("/addsubcategory")
	public String addexpense() {
	return "AddSubcategory";
}
	@PostMapping("/addsubcategory")
	public String addExpense(SubCategoryBean subcategoryBean) {
		subcategoryDao.addSubCategory(subcategoryBean);
		return "Home";
	}
}
