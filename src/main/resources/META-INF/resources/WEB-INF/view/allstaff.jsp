<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Registered in the System</title>
<hr>
</head>
<body>
	<%@ include file="header.jsp"%>

	<br>
	<h3 align="center">Staff Details</h3>
	<hr>
	<br>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Date Of Birth</th>
				<th scope="col">Hired Date</th>
				<th scope="col">Department</th>
				<th scope="col">View Details</th>

			</tr>
		</thead>
		<tbody>

			<!-- In JSP, we can access any data using Objects coming from the controller -->

			<c:forEach items="${staffs}" var="staffs">

				<tr>
					<td>${staffs.getStaff_name()}</td>
					<td>${staffs.getDob()}</td>
					<td>${staffs.getHiredDate()}</td>
					<td>${staffs.getDepartment()}</td>
					<td><a href="http://localhost:7070/staff/${staffs.getId()}">
							<button type="button" class="btn btn-success">View
								Details</button>
					</a></td>


				</tr>
			</c:forEach>

		</tbody>
	</table>
	<%@ include file="footer.jsp"%>

</body>
</html>