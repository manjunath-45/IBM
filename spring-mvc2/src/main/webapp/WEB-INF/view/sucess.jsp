<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
	Hello ${emp.employeeName }
	<br /> Your Age Is:${emp.age }<br/>
	<a href="http://localhost:8081/spring-mvc2"> goto main page</a>
</body>
</html>