<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.errorblock {
	color: #ff0000;
	background-color: #ffeeee;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'>
	<h3>Fitness Tracker Login Page</h3>
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your Login was Unsuccessful, <br />
			Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }
		</div>
	</c:if>

	<form action="j_spring_security_check" name="f" method="post">
		<table>
			<tr>
				<td>UserName : </td>
				<td><input type="text" name="j_username" value="" placeholder="Enter User Name"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" name="j_password" value="" placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td> <input type="submit" name="submit" value="Submit"></td>
				<td> <input type="reset" name="reset" value="Reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>