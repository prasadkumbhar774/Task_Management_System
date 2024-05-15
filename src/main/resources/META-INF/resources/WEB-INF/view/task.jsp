<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Todo's</title>
</head>
<body>

	<%@ include file="header.jsp"%>
	<br>
	<br>
	<div>
		<h1 align="center">
			Add Task
			</h2>
	</div>
	<hr>
	<br>


	<div style="margin-left: 60px">
		<form action="/addTask" method="post">

			<table>
				<tr>
					<td>ToDo Description :</td>

					<td><textarea cols=50 rows=6 name="task_descrption"></textarea></td>
				</tr>
				<tr>
					<td>Created Date:</td>

					<td><input type="date" name="created_date"></td>
				</tr>
				<tr>
					<td>Due Date :</td>
					<td><input type="date" name="due_date"></td>
				</tr>

				<tr>
					<td>Assigned To :</td>
					<td><input type="email" name="email"
						placeholder="Employee email address"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add ToDo"
						class="btn btn-success"></td>
				</tr>
			</table>


		</form>

	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>