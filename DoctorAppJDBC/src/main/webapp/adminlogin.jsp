<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<form action=" loginServlet">
Enter UserName<input type="text" name="username" placeholder="username">
<br>
Enter Password<input type="password" name="password" placeholder="Password">
<br>
<input type="submit" name="submit">
<input type="reset" name="reset">
</form>
</body>
</html>