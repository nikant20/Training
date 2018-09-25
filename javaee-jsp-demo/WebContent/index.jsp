<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Demo</title>
</head>
<body>
	<h1 style="color:blue" >First Jsp Example</h1>
	
	<%!
		int i = 1;
	%>
	<%
		int j = 1;
	    i++;
	    j++;
	    Date date = new Date();
	%>
	<%
		int k = 1;
	%>
	
	<h2>System date: <%=date%></h2>
	<p>Value of i: <%=i %></p>
	<p>Value of j: <%=j %></p>
	<%@include file = "abc.txt" %>
	<h3>Learning about implicit Object</h3><hr>
	<div>
		<h3>Session id: <%=session.getId() %></h3>
		<h3>Session New: <%=session.isNew() %></h3>
		<h3>Session Creation Time: <%=new Date(session.getCreationTime()) %></h3>
	</div>
	<%
		if(i%5==0){
			session.invalidate();
		}
	%>
</body>
</html>