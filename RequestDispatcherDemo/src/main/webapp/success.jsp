<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> hello</h1>
<%
String empname = (String) request.getAttribute("employeeName");
String empCity = (String) request.getAttribute("employeecity");
double salary = (Double) request.getAttribute("employeesalary");
String course= (String) request.getAttribute("employeeCourse");
Long mobile = (Long) request.getAttribute("employeeMobile");
String[] hobbies = (String[])request.getAttribute("employeeHobbies");

out.print("Employee name: " +empname);
out.print("Employee City: "+empCity);
out.print("Employee Salary: "+salary);
out.print("Employee Course: "+course);
out.print("Employee Mobile: "+mobile);
out.print("Hobbies");
for(String hobby :hobbies){
out.println("hobby: "+hobby.toUpperCase()+"<br>");
}
%>
</body>
</html>