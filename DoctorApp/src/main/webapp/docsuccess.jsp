
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.doctor.model.Doctor"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Doctor Details</h1>
<%
 Doctor doctor = (Doctor) request.getAttribute("doctor");
 out.println("welcome : "+ doctor.getDoctorName() +"<br>");
 out.println("welcome : "+ doctor.getDoctorName() +"<br>");
 out.println("welcome : "+ doctor.getDoctorName() +"<br>");
 out.println("welcome : "+ doctor.getDoctorName() +"<br>");
 out.println("welcome : "+ doctor.getDoctorName() +"<br>");
 
 %>

</body>
</html>