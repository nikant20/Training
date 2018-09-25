<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Learning JSTL</h2>
	<h3>Through EL</h3>
	<p>Name: ${allUsers[0].userName} and Age: ${allUsers[0].age}</p>
	<p>Name: ${allUsers[1].userName} and Age: ${allUsers[1].age}</p>
	<h3>Through JSTL</h3>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
	
	<core:forEach var="u" items="${allUsers}">
		<core:if test="${u.age > 40}">
			<p style='color:red'>Name: ${u.userName} and Age: ${u.age}</p>
		</core:if>
		
		<core:if test="${u.age <= 40}">
			<p style='color:blue'>Name: ${u.userName} and Age: ${u.age}</p>
		</core:if>
		
	</core:forEach>	 	 
</body>
</html>