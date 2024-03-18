<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="doctorServlet">
        Enter DoctorName<input type="text" name="doctorName"> <br>
        Enter DoctorId<input type="text" name="doctorId"><br>
        Enter Experience<input type="text" name="experience"><br>
        Enter Fees<input type="text" name="fees"><br>
        
		Enter Speciality
        <Select name="Course">
        <option value="ORTHOPEDIATRICIAN">ORTHOPEDIATRICIAN</option>
        <option value="PEDIATRICIAN">PEDIATRICIAN</option>
        <option value="GYNAECOLOGIST">GYNAECOLOGIST</option>
        <option value="NEUROLOGY">NEUROLOGY</option>
        </Select><br>

<input type="submit" value="submit">
    </form>
    
</body>
</html>