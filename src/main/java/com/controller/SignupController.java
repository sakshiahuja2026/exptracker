package com.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;
import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SignupController {
@Autowired
UserDao userDao;

/*
 * @GetMapping("/signup") public String signUp() {
 * System.out.println("signin done"); return"Signup"; }
 */	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signUp(UserBean user,Model model) {
		model.addAttribute(user);
		return"Signup";
	}
	
	
	/*
	 * @PostMapping("/saveuser") public String saveUser(UserBean user) {
	 * user.setUserType("customer"); userDao.addUser(user);
	 * 
	 * return"Login"; }
	 */
	
	@RequestMapping(value="/saveuser" , method = RequestMethod.POST)
	public String signUp(@ModelAttribute("user") @Valid UserBean user, BindingResult result, Model model) {
		System.out.println("SaveUser called.....");
		System.out.println(result);
		if (result.hasErrors()) {// true == error
			model.addAttribute("user", user);
			return "Signup";
		} else {
			 user.setUserType("customer");
			 userDao.addUser(user);
			 model.addAttribute("msg","Signup done..");
			 return "Login";
			 		
		}
	}
	
	@GetMapping("/login")
	public String login() {
	return"Login";	
	}
	
	@PostMapping("/login")
	public String authenticate(LoginBean login ,Model model, HttpSession session) {
		UserBean user = userDao.authenticate(login);
		if(user == null) {
			model.addAttribute("msg", "Invalid Crenditials!!!");
			return "Login";
		}
		 else if (user.getUserType().contentEquals("customer")) {
				session.setAttribute("user", user);
				return "Home";
			} else if (user.getUserType().contentEquals("admin")) {
				session.setAttribute("user", user);
				return "Dashboard";
			} else {
				model.addAttribute("msg", "Please Contact Admin");
				return "Login";
			}
	}
}
