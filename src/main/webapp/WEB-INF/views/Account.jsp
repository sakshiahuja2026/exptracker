<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Which account you want to create?</h2>
<form method="post" action="saveaccount">
		Question : <select name="account">
			<option value="Paytm">Paytm</option>
			<option value="Credit Card">Credit Card</option>
			<option value="Debit Card">Debitit Card</option>
		</select> <br>
		
		<br> <input type="submit" value="SetQuestion" />
	</form>

</body>
</html>