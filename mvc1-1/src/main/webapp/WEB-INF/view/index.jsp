<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="employee">
Country:<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="Germany" label="Germany"/>
<form:option value="India" label="India"/>
</form:select>
<input type=submit">
</form:form>

</body>
</html> 