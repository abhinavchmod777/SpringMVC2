<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful</title>
</head>
<body>
<h1>${headerMsg}</h1>
<h2>Your Entered details are : </h2>
<table>
<tr>
<td>Entered Name : </td>
<td>${student1.studentName}</td>
</tr>
<tr>
<td>Entered Hobby : </td>
<td>${student1.studentHobby}</td>
</tr>
<tr>
<td>Entered Mobile# : </td>
<td>${student1.studentMobile}</td>
</tr>
<tr>
<td>Entered DOB : </td>
<td>${student1.studentDOB}</td>
</tr>

</table>
</body>
</html>