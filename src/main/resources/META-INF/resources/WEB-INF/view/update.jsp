<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task Management System</title>
</head>
<body>


	<!-- include the header of the page in this section -->

	<%@ include file="header.jsp"%>
	<br>
	<br>
	<div style="margin-left: 60px">
		<form action="/updateToDo/${todo.getId() }" method="post">
					
			<table cellpadding=10px>
				<tr>
					<td>ToDo Description :</td>

					<td><textarea cols=50 rows=6 name="task_descrption">
					
					 ${todo.getTask_descrption()}
					</textarea></td>
				</tr>
				<tr>
					<td>Created Date:</td>

					<td><input type="date" name="created_date" value = ${todo.getCreated_date()}></td>
				</tr>
				<tr>
					<td>Due Date :</td>
					<td><input type="date" name="due_date" value = ${todo.getDue_date()}></td>
				</tr>
				
				<tr>
					<td>Assigned To :</td>
					<td><input type="email" name="email" placeholder = "Employee email address" value = ${todo.getEmail()}></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update ToDo" class="btn btn-success"></td>
				</tr>
			</table>
			

		</form>
	</div>







	<!-- include the footer of the page in this section -->

	<%@ include file="footer.jsp"%>

</body>
</html>