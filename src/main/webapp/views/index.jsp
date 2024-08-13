<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addStudent" method="POST">
		Enter
		your name : <input type="text" name="name"><br> Enter
		your email : <input type="email" name="email"><br> <input
			type="submit">
	</form>

	<hr>

	<form action="getStudent" method="GET">
		Enter id : <input type="text" name="id"><br> <input
			type="submit">
	</form>

	<hr>

	<form action="getStudentByName" method="GET">
		Enter your name : <input type="text" name="name"><br> <input
			type="submit">
	</form>
</body>
</html>