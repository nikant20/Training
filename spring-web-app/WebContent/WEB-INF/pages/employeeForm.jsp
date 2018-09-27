<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is an Employee Registration Page</h2>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
	<sf:form action="store" method="post" commandName="employee">
		<label>Enter Id</label><sf:input path="id"/>
		<label>Enter name</label><sf:input path="name"/>
		<label>Select Gender: </label><sf:input path="gender"/>
		<label>Enter Phone No:</label><sf:input path="phoneNumber"/>
		<input type="submit" value="Register">
	</sf:form>
	
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="df" %>
		<df:form action="findbyid" method="get" commandName="employee">
			<label>Enter Id</label><sf:input path="id"/>
			<input type="submit" value="Submit">
		</df:form>
		
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="ef" %>
		<ef:form action="deletebyid" method="get" commandName="employee">
			<label>Enter Id</label><ef:input path="id"/>
			<input type="submit" value="Delete">
		</ef:form>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="shf" %>
		<shf:form action="showall" method="get" commandName="employee">
			<input type="submit" value="Showall">
		</shf:form>	
</body>
</html>