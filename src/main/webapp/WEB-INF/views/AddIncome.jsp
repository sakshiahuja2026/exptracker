<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Income</title>
</head>
<body>
<%UserBean user = (UserBean)session.getAttribute("user");%> 
<h2>Which account you want to create?</h2>
<form method="post" action="saveincome">
		<label>Type Of Account :</label> <select name="accountType">
			<option value="cash">Cash</option>
			<option value="paytm">Paytm</option>
			<option value="creditCard">Credit Card</option>
			<option value="debitCard">Debit Card</option>
			
		</select> <br>
		<label>Amount:</label>
		<input type="text" name="amount">
		<input type="hidden" name="userId" value="<%=user.getUserId()%>">
		<input type="button" name="Add">
		<br> <input type="submit" value="setincome" />
		
	</form>

</body>
</html>