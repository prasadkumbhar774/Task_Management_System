<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff Information Details</title>
</head>
<body>

<%@ include file="header.jsp"%>

<table>

<tr>
<td> <img src = "image/${staff.getPicture()}" height = 100px width = 100px></td>
</tr>

<tr>
<td>${staff.getStaff_name()} </td>
</tr>
<tr>
<td>${staff.getDepartment()} </td>
</tr>

<tr>
<td>${staff.getDob()} </td>
</tr>

<tr>
<td>${staff.getHiredDate()} </td>
</tr>


</table>



</body>
</html>