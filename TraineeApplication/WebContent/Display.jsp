<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Trainee Details</h1>
<table border="1px solid">
<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Location</td>
			<td>Domain</td>
			
		</tr>
	<c:forEach var="tr" items="${tlist}">
		<tr>
			<td>${tr.traineeId}</td>
			<td>${tr.traineeName}</td>
			<td>${tr.traineeLocation}</td>
			<td>${tr.traineeDomain}</td>
			
		</tr>
	</c:forEach>
</table>
</body>
</html>