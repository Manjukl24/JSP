<%@ import java.util.* %>
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
List<String> movies = (List<String>) request.getAttribute("langMovies");

out.println("The list of movies chosen by " + movies + "are:");
for(String movie: movies){
out.println(movie + "");
}
%>
</body>
</html>