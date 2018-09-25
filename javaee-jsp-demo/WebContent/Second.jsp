<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to Second Page to display</h2>
	<jsp:useBean id="userKey" class="com.opteamix.beans.User" scope="request"></jsp:useBean>
	<jsp:useBean id="userKey2" class="com.opteamix.beans.User" scope="session"></jsp:useBean>
	<jsp:useBean id="userKey3" class="com.opteamix.beans.User" scope="application"></jsp:useBean>
	<h3>
		User 1 Detail with useBean, EL, JSTL
	</h3>
		<p>Hello <jsp:getProperty property="userName" name="userKey"/>,
		   Your age is: <jsp:getProperty property="age" name="userKey"/>
		</p>
		<p>Hello ${userKey.userName}, Your age is ${userKey.age}</p> 
		<hr>
		<h3>User 2 Detail with useBean, EL, JSTL</h3>
			<p>Hello <jsp:getProperty property="userName" name="userKey2"/>,
		   Your age is: <jsp:getProperty property="age" name="userKey2"/>
		</p>
		<p>Hello ${userKey2.userName}, Your age is ${userKey2.age}</p>
		<hr>    
		<h3>User 3 Detail with useBean, EL, JSTL</h3>
			<p>Hello <jsp:getProperty property="userName" name="userKey3"/>,
		   Your age is: <jsp:getProperty property="age" name="userKey3"/>
		</p>
		<p>Hello ${userKey3.userName}, Your age is ${userKey3.age}</p>
		<hr> 
</body>
</html>