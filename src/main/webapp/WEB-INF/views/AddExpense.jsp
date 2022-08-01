<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	UserBean user = (UserBean) session.getAttribute("user");
	%>
	<form action="addexpense" method="post">
		Category:<select name="category">
			<option value="Food">Food</option>
			<option value="Clothing">Clothing</option>
			<option value="Transportation">Transportation</option>
			<option value="Rent">Rent</option>
			<option value="Travel">Travel</option>
			<option value="Bills">Bills</option>
			<option value="Tax">tax</option>
			<c:forEach items="${category}" var="c">
				<option value="${c.categoryName}">${c.categoryName}</option>
			</c:forEach>


		</select> <br><br>
		Date:<input type="date" name="date" /><br> <br>
		
		Time:<input type="time" name="time" /><br><br>
		
		Description:<input type="text" name="description" /><br><br>
		
		Amount:<input type="text" name="amount" /><br><br>
		
		Type of Payment:<select name="typeofpayment">
			<c:forEach items="${incomeType}" var="i">
				<option value="${i.accountType}">${i.accountType} ${i.cardNo} ${i.upiId}</option>
			</c:forEach>
		</select><br> <br>
		<input type="hidden" value="<%=user.getUserId()%>" name="userId" />
		<button>Add Expense</button>
	</form>
</body>
</html>