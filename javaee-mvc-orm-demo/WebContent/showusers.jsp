<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>you are seeing all the users</h2>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="core" %>
	<table border="1" style="padding: 10px">
		<tr>
			<th>UserName</th>
			<th>Gender</th>
			<th>Phone Number</th>
		</tr>
		<core:forEach var="userProfile" items="${listKey}">
			<tr>
				<td>${userProfile.userName}</td> 
					<td>${userProfile.gender}</td> 
						<td>${userProfile.phone}</td>
			</tr>			
		</core:forEach>
	</table>
</body>
</html>