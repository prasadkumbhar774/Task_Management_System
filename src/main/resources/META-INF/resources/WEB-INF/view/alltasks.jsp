<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Tasks | Spring Boot</title>
</head>
<body>
	<!-- The following is adding the header to the page -->
	<%@ include file="header.jsp"%>
	<br>
	<h3 align="center">Task Management System</h3>
	<hr>
	<br>


	<table class="table table-hover">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Task ID</th>
				<th scope="col">Task Description</th>
				<th scope="col">Created Date</th>
				<th scope="col">Due Date</th>
				<th scope="col">Days Passed</th>
			</tr>
		</thead>
		<tbody>


			<c:forEach items="${tasks}" var="task">

				<tr>
					<td>${task.value.getId()}</td>
					<td>${task.value.getTask_descrption()}</td>
					<td>${task.value.getDue_date()}</td>
					<td>${task.value.getCreated_date()}</td>
					<td>${task.key.getDays()}days</td>

				</tr>
			</c:forEach>

		</tbody>
	</table>




	<%@ include file="footer.jsp"%>
	<!--  The following is adding the footer to the page -->
</body>
</html>