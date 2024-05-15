<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<br>
	<br>
	
	<h2 align = "center">Employee Registration Form</h2>
	<hr>
	<div style="margin-left: 50px;">
		<form action="registration" method="post"
			enctype="multipart/form-data">
			<table cellpadding=10px>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="staff_name"></td>
				</tr>
				<tr>
					<td>Department :</td>
					<td><input type="text" name="department"></td>
				</tr>
				<tr>
					<td>Date Of Birth :</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td>Hired Date :</td>
					<td><input type="date" name="hiredDate"></td>
				</tr>
				
				<tr>
					<td>E-mail :</td>
					<td><input type="text" name="useremail"></td>
				</tr>

				<tr>
					<td>upload Picture:</td>
					<td><input type="file" name="file"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register Staff" class="btn btn-success"></td>

				</tr>


			</table>
		</form>
	</div>
<hr>

	<%@ include file="footer.jsp"%>

</body>
</html>