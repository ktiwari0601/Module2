<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter trainee details</h1>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="addDetails.obj" modelAttribute="trainee">
	Enter Trainee Id : 
	<f:input path="traineeId"/>
	<f:errors cssStyle="color:red" path="traineeId"/><br>
	
	Enter Trainee Name : 
	<f:input path="traineeName"/>
	<f:errors cssStyle="color:red" path="traineeName"/><br>
	
	Enter Trainee Location : 
	<f:radiobutton value="Chennai" path="traineeLocation"/>chennai
	<f:radiobutton value="Mumbai" path="traineeLocation"/>Mumbai
	<f:radiobutton value="Pune" path="traineeLocation"/>Pune
	<f:radiobutton value="Bangalore" path="traineeLocation"/>Bangalore
	<f:errors cssStyle="color:red" path="traineeLocation"/><br>
	
	Enter Trainee Domain : 
	<f:select path="traineeDomain">
	<f:option value="Analyst">Analyst</f:option>
	<f:option value="Tester">Tester</f:option>
	</f:select>
	<f:errors cssStyle="color:red" path="traineeDomain"/><br>
	
	<input type="submit" value="Add Trainee"/>
</f:form>
</body>
</html>