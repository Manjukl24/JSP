<%@page import="java.util.*"%>
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
pageContext.setAttribute("message", "welcome");
request.setAttribute("message", "Good Day in request");
session.setAttribute("message", "Great Day in session");
application.setAttribute("message", "Graat Day in application");
%>

<h2> Using Scripting</h2>
<%= message1 %><br>
<%= message2 %><br>
<%= message3 %><br>

<h2>Using EL</h2>
${message }
${requestScope.message}
${sessionScope.message}
${applicationScope.message}

</body>
</html>