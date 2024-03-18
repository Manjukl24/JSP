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
out.println("Employee Details"<br>");

Employee employee = (Employee)request.getAttribute("employee");

String employeeName= employee = employee.getEmployeeName();
out.println("Employee Name:"+employeeName+"<br>");

Integer employeeId= employee = employee.getEmployeeId();
out.println("Employee Id:"+employeeId+"<br>");

Double salary= employee = employee.getsalary();
out.println("Employee salary:"+employeesalary+"<br>");

String city= employee = employee.getcity();
out.println("Employee city:"+employeecity+"<br>");
%>

</body>
</html>