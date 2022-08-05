<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Amount</title>
</head>
<body>

	<h2>View Amount</h2>
	<table border="1">
		<tr>
			<th>Account Type</th>
			<th>Amount</th>
			<th>User ID</th>
			<th>Card No</th>
			<th>Upi Id</th>
		</tr>
		<c:forEach items="${amount}" var="i">
			<tr>
				<td>${i.accountType}</td>
				<td>${i.amount}</td>
				<td>${i.userId}</td>
				<td>${i.cardNo}</td>
				<td>${i.upiId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>