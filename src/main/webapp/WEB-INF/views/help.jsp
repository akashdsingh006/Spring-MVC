<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<% String name=(String)request.getAttribute("name");
		Integer num=(Integer)request.getAttribute("num");
		
	%>
	
	<h1><%=name %></h1>
	
	<h1> ${num}</h1>
	
	<c:forEach var="data" items="${list}" >
		<h1>${data}</h1>
	</c:forEach>
</body>
</html>