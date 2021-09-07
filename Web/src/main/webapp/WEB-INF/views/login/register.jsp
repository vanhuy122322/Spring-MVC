	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ taglib  prefix = "form" uri = "http://www.springframework.org/tags/form"  %>   
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V3</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="resources/resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/bootstrap/resources/resources/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/resources/resources/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/resources/resources/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/animsition/resources/resources/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="resources/resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('resources/resources/images/bg-01.jpg');">
			<div class="wrap-login100">
				<c:if test="${status }">
				<h1>${status }</h1>
				</c:if>
				<form:form action="dang-ky" method="POST" class="login100-form validate-form" modelAttribute ="user" >    
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Đăng ký
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
					
						<form:input  class="input100" type="text" name="username" placeholder="Username" path ="username" />    
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						
							<form:input class="input100" type="password" name="pass" placeholder="Password" path ="password" />    
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "fullname">
				
						<form:input class="input100" type="text" name="fullname" placeholder="fullname" path ="display_name" />   
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="address">
				
							<form:input class="input100" type="address" name="address" placeholder="address" path ="address" /> 
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">
							Đăng ký tài khoản
						</button>
					</div>

					<div class="text-center p-t-90">
						<a class="txt1" href="#">
							Forgot Password?
						</a>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="resources/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/vendor/animsition/resources/resources/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/vendor/bootstrap/resources/resources/js/popper.js"></script>
	<script src="resources/resources/vendor/bootstrap/resources/resources/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="resources/resources/js/main.js"></script>

</body>
</html>