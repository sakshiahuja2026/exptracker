<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sub Category</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
</head>
<body>
<h2>Add Sub Category</h2>
<%
	UserBean user = (UserBean) session.getAttribute("user");
	%>
	<form action="addsubcategory" method="post">
		<label>Category</label><select name="subcategory">
			<option value="food">Food</option>
			<option value="clothing">Clothing</option>
			<option value="transportation">Transportation</option>
			<option value="rent">Rent</option>
			<option value="travel">Travel</option>
			<option value="bills">Bills</option>
			<option value="Tax">tax</option>
			<c:forEach items="${category}" var="c">
				<option value="">${c.categoryName}</option>
			</c:forEach>
</select><br> 
<input type="hidden" value="<%=user.getUserId()%>"
			name="userId" /><br>
		<br> <input type="button" id="sub" value="add">
		</form>
		<script>
		$(document).ready(function(){
			$("#sub").click(function(){
				let url="http://localhost:9888/addsubcategory";
			}
			
		}
		</script>
</body>
</html>