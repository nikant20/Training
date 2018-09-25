<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Showing User detail</h2>
		<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
		
			<h4>${userDetails.userName }</h4>
			<h4>${userDetails.gender }</h4>
			<h4>${userDetails.phone }</h4>
				
		<form action="SearchServlet" method="post">
			<label>Enter Phone: </label> <input type="text" name="phoneNumber">
			<input type="submit" value="Search">
		</form>	 		
	
</body>
</html>