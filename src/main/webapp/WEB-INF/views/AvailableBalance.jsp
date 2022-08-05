<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Balance</title>
</head>
<body>
	<h2>Total Income</h2>

	<c:forEach items="${balance}" var="b">
		
			${b.amount}	
	</c:forEach>
	${b.totalbalance }
</body>
</html>