<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
	<style type="text/css">
	.special-img 
{
    position: relative;
    top: -5px;
    float: left;
    left: -5px;
}
.profile-image  {
	padding-top: 0px;
	padding-bottom: 0px;
}
	</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Exp Manager</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="Dashboard.jsp">User<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Amount </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="addamount">Add Amount</a> <a
							class="dropdown-item" href="listamount">View Amount</a>

					</div></li>



				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Expense </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="addexpense">Add Expense</a> <a
							class="dropdown-item" href="listexpense">View Expense</a>

					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Category </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="addcategory">Add Category </a> <a
							class="dropdown-item" href="listcategory">View Category</a> <a
							class="dropdown-item" href="addsubcategory">Add Sub Category</a>
					</div></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Balance </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="showbalance">View Balance </a>
						
						
						<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Profile </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="newprofile">Add Profile </a> <a
							class="dropdown-item" href="listProfile">View Profile</a> 
							
					</div></li>
					      <mdb-dropdown tag="li" class="nav-item avatar" anchorClass="p-0">
        <mdb-dropdown-toggle tag="a" navLink color="stylish" slot="toggle" waves-fixed>
          
          <img src="${profiles.imgUrl}"
            class="rounded-circle z-depth-0"
            alt="avatar image"
            height="35"
          />
        </mdb-dropdown-toggle>
					
			<%-- <c:forEach items="${profiles }" var="p">
			<tr>
				<td><img src="${p.imgUrl}" --%>		
					
					<!-- <div>
					<li class="dropdown">
					<a href="#" class="dropdown-toggle profile-image" data-toggle="dropdown">
					<img src="http://placehold.it/30x30" class="img-circle special-img"> Test <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-cog"></i> Account</a></li>
					</li></div>
					</div>
					</li> -->
			</ul>
			


			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
			<form class="form-inline my-2 my-lg-0">

				<!--  <button class="btn btn-outline-success my-2 my-sm-0" type="submit">My Carts</button>-->
				<a href="logout" class="btn btn-outline-success my-2 my-sm-0">Logout</a>
			</form>
			<form class="form-inline my-2 my-lg-0">

				<!--   <button class="btn btn-outline-success my-2 my-sm-0" type="submit">My Carts</button>-->
				<!-- <a href="DisableController"
					class="btn btn-outline-success my-2 my-sm-0">Ac Disable</a> -->
			</form>
		</div>
	</nav>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>

	<h3 a href="showbalance">Available Balance:</h3>
</body>
</html>