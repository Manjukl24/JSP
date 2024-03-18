<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  Expression Language -->
Welcome ${employee.employeeName }
<br> City ${employee.city }
<br> Id ${employee.employeeId }
<br> salary ${employee.salary }
<br> Course ${employee.employeecourse }

<br>
${message }<br>
${message 1 }<br>
${sessionScope.message1 }

</body>
</html>