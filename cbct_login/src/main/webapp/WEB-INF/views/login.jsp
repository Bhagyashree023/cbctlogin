<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/login.css" rel="stylesheet">
<title>User Login Form</title>

</head>
<body>
	<div align="center">
		<h2>User Login</h2>
		<form:form action="login" method="post" modelAttribute="user">
			
			<form:label path="email">E-mail:</form:label>
			<form:input path="email"/><br/>
			
			<form:label path="password">Password:</form:label>
			<form:password path="password"/><br/>
			<p>${error}</p>
			<form:button>Login</form:button>
			<a href="">New User? Register Here</a>
		</form:form>
	</div>
</body>
</html>