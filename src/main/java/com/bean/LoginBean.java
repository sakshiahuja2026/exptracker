package com.bean;

import javax.validation.constraints.NotBlank;

public class LoginBean {
@NotBlank(message = "Please Enter Email")
String email;
@NotBlank(message = "Please Enter Password")
String password;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
