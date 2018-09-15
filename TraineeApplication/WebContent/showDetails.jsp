<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Retrieve Operation</h1>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="showDetails.obj" modelAttribute="trainee">
<table>
<tr>
<td>Please Enter Trainee Id</td>
<td><f:input path="traineeId"/></td>
<td><input type="submit" value="retrieve"/></td>
</tr>
</table>
</f:form>


<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<c:if test="${view_mode==2}">
<h1>Trainee Info</h1>
<table border="1px solid">
<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Location</td>
			<td>Domain</td>
			
		</tr>
	
		<tr>
			<f:form modelAttribute="trainee1">
			<td>${trainee1.traineeId}</td>
			<td>${trainee1.traineeName}</td>
			<td>${trainee1.traineeLocation}</td>
			<td>${trainee1.traineeDomain}</td>
			</f:form>
		</tr>
	
</table>
</c:if>
</body>
</html>