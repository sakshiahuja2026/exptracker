<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<style>
.divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
.h-custom {
height: calc(100% - 73px);
}
@media (max-width: 450px) {
.h-custom {
height: 100%;
}
}
</style>
</head>
<body>

		<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
       
        <s:form action="login" method="post" modelAttribute="login">
        
          <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
            <p class="lead fw-normal mb-0 me-3">Login</p>
            
          </div>

          <!-- Email input -->
          <div class="form-outline mb-4">
          Email : <s:input  class="form-control form-control-lg" path="email" />
		<s:errors path="email"></s:errors><br><br>
           
          </div>

          <!-- Password input -->
          <div class="form-outline mb-3">
          Password :<s:password class="form-control form-control-lg" path="password" />
		<s:errors path="password"></s:errors>
           
          </div>

          <div class="d-flex justify-content-between align-items-center">
            <!-- Checkbox -->
            <div class="form-check mb-0">
              <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" />
              <label class="form-check-label" for="form2Example3">
                Remember me
              </label>
            </div>
            <a href="#!" class="text-body">Forgot password?</a>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
<!--             <button type="button" class="btn btn-primary btn-lg" 
              style="padding-left: 2.5rem; padding-right: 2.5rem; " >Login</button>
              
 -->            
 <input type="submit" class="btn btn-primary btn-lg" value="Login"/>
 <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="signup"
                class="link-danger">Register</a></p>
          </div>

        </s:form>
      </div>
    </div>
  
    </div>
    <!-- Right -->
  
</section>
</body>
</html>