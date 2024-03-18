<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- name,id,salary,city,course, -->

 <form action="employeeServlet">
        Enter Name<input type="text" name="username" placeholder="Enter Name">
        <br>
        Enter password<input type="password" name="password"><br>
        Gender
        <input type="radio" name="gender" value="male" checked>male
        <input type="radio" name="gender" value="female" checked>female
        <br>
        <Select> Course
        </Select name="Course" multiple size="3">
        <option value="Java">Java</option>
        <option value="Spring">Spring</option>
        <option value="Angular">Angular</option>
        <option value="Node">Node</option>
        </Select><br>
        Hobbies
        <input type="checkbox" name="hobby" value="dance">dance
        <input type="checkbox" name="hobby" value="music">music
        <input type="checkbox" name="hobby" value="sports">sports
        <input type="checkbox" name="hobby" value="reading">reading
<br>
Comments<textarea rows="20" columns="20">Share your thoughts 
</textarea>
<input type="submit" value="Enter Details">
    </form>
</body>
</html>