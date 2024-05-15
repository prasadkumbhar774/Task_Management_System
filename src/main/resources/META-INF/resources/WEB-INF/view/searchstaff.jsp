<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Todo's</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<br>
	<h3 align="center">Search Staff With Email Address</h3>
	<hr>

	<form action="search" method="GET">

		<table>
			<tr>
				<td><input type="email" placeholder="Enter Email address"
					name="email"></td>
				<td><input type="submit" value=" Search "
					class="btn btn-success"></td>
			</tr>

		</table>


	</form>
</body>
</html>