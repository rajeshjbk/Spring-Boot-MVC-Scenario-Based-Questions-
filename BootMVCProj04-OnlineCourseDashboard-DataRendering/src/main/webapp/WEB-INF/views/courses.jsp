<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Details</title>
</head>
<body>
	<h2 style="color: red; text-align:center;">Course Details</h2>

	<b>${java.courseName} | ${java.duration} months | ${java.instructor} |
		₹${java.price}</b>
	<br>
	<br>
	<b>${springboot.courseName} | ${springboot.duration} months |
		${springboot.instructor} | ₹${springboot.price}</b>
	<br>
	<br>
</body>
</html>