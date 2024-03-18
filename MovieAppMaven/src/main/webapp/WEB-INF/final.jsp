<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("SessionId"+session.getId()+"<br>");
out.println("Maxinactive"+session.SessionMaxinactiveInterval()+"<br>");
String username = (String)session.getAttribute("username");
out.print("Welcome "+username);
%>
</body>
</html>