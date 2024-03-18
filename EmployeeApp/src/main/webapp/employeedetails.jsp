<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is the details of employee</h1>
<%
Employee employee = (employee)request.getAttribute("employee");

String name = employee.getEmployee();
Out.print("Welcome" + name+ "<br>");
String city = employee.getCity();
Out.print("City" + city+ "<br>");
int Id = employee.getId();
Out.print("Id" + Id+ "<br>");
double salary= employee.getsalary();
Out.print("salary" + Id+ "<br>");
String course= employee.getcourse();
Out.print("course" + Id+ "<br>");

%>
</body>
</html>