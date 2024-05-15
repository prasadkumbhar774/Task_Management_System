<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To Do Management System</title>
</head>
<body>

	<!-- include the header of the page in this section -->

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
				<th scope="col">Update ToDo's</th>
				<th scope="col">Delete ToDo's</th>
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

					<td><a
						href="http://localhost:7070/update/${task.value.getId()}">
							<button type="button" class="btn btn-warning">Update</button>
					</a></td>

					<td><a
						href="http://localhost:7070/delete/${task.value.getId()}">
							<button type="button" class="btn btn-danger"
								onclick="return confirm('Are you sure you want to delete this Todo?');">
								Delete</button>
					</a></td>

				</tr>
			</c:forEach>

		</tbody>
	</table>


	<br>
	<a href="/task"><button type="button" class="btn btn-success">Add</button>
	</a>

	<!-- The follwoing is accessed from the ToDo applicaiton -->
	<br>
	<br>
	

	<!-- include the footer of the page in this section -->

	<br>



	<%@ include file="footer.jsp"%>

</body>
</html>