<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Add into the todo table</title>

</head>


<body>



	Please Add the todo's :

	<div style="margin-left: 80px; line-height: 22px;">

		<form action="../addToDo" method="post">

			<textarea cols=50 rows=10 name="todo"></textarea>
			<br> <input type="submit" value="submit">

		</form>

	</div>

</body>
</html>