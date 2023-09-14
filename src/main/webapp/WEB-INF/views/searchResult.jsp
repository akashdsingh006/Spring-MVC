<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Data</title>
</head>
<body>
<%-- 	<%
	String email = (String) request.getAttribute("email");
	String username = (String) request.getAttribute("username");
	String password = (String) request.getAttribute("password");
	%> --%>
	
	<%-- <h1>
	<%= email %>
	<%= username %>
	<%= password %>
	</h1>--%>
	
	<h1>
		${searchEmployee.employeeId}
		${searchEmployee.employeeEmail}
		${searchEmployee.employeeName}
		
		${searchEmployee.employeeCourse}
	</h1>
	
	
</body>
</html>