<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<h1>${headerMsg}</h1>
<form:errors path="student1.*"/>
<h2> Enter Details</h2>
<form action="/mvc/submitForm.html">
<table>
<tr>
<td><label for="studnetName">name</label></td>
<td><input type ="text" name="studentName"></td>
</tr>
<tr>
<td><label for="studentHobby">hobby</label></td>
<td><input type="text" name="studentHobby"></td>
</tr>
<tr>
<td><label for="studentMobile">Mobile</label></td>
<td><input type="text" name="studentMobile"></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
</table>
</form>

</body>
</html>