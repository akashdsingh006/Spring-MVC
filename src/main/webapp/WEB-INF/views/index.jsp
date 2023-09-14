<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>This is my home page.</h2>
	
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
	%>
	
	<h1>Hi <%= name %></h1>
	<h4>Your id: <%= id %></h4>
</body>
</html>