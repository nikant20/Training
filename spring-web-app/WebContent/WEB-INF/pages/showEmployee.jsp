<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${successKey}</h3>
	<p>Id is: ${employee.id}</p><br>
	<p>Name is: ${employee.name}</p><br>
	<p>PhoneNumber: ${employee.phoneNumber} </p><br>
	<p>Gender: ${employee.gender}</p><br>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone Number</th>
			<th>Gender</th>
		</tr>
			<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
			
				<td>${employeebyid.id}</td>
				<td>${employeebyid.name}</td>
				<td>${employeebyid.phoneNumber}</td>
				<td>${employeebyid.gender}</td>
			
	</table>
	
	<h2>${deletebyid}</h2>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
		<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone Number</th>
			<th>Gender</th>
		</tr>
			
			<core:forEach var="u" items="${showall}">
			<tr>
				<td>${u.id}</td>
				<td>${u.name}</td>
				<td>${u.phoneNumber}</td>
				<td>${u.gender}</td>
			</tr>	
			</core:forEach>
	</table>
	
	
</body>
</html>