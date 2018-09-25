<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Registered Successfully</h2>
	<p>
		Username: ${userKey.userName}
	</p>
	<p>
		Gender: ${userKey.gender}
	</p>
	<p>
		Phone Number: ${userKey.phone}
	</p>
	<a href= "index.html">Register Again</a>
</body>
</html>