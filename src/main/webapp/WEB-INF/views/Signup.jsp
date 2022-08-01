<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>

<s:form action="saveuser" method="post" modelAttribute="user">
	
		FirstName: <s:input path="firstName" />
		<s:errors path="firstName"></s:errors><br><br>
		LastName: <s:input path="lastName" />
		<s:errors path="lastName"></s:errors><br><br>	
	Email : <s:input path="email" />
		<s:errors path="email"></s:errors><br><br>
		Password :<s:password path="password" />
		<s:errors path="password"></s:errors><br><br>
		Gender: Male <s:radiobutton path="gender" value="male" />
				Female <s:radiobutton path="gender" value="female" /><br><br>
	
		
		<input type="submit" value="Signup" />
	</s:form>



</body>
</html>