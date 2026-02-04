<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Submitted Employee Form</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td>${employee.name}</td>
		</tr>
		<tr>
			<td>Email: </td>
			<td>${employee.email}</td>
		</tr>
		<tr>
			<td>Phone: </td>
			<td>${employee.phone}</td>
		</tr>
	</table>
</body>
</html>