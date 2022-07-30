<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Income</title>
</head>
<body>

<h2>View Income</h2>
<table border="1">
<tr>
<th>Account Type</th>
<th>Amount</th>
<th>User ID</th>
</tr>
<c:forEach items="${income}" var="i">
<tr>
<td>${i.accountType}</td>
<td>${i.amount}</td>
<td>${i.userId}</td>
</tr>
</c:forEach>
</table>
</body>
</html>