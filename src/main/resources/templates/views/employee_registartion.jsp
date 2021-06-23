<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3 style="text-align: center; color: red;">Employee Registration</h3>
		<form action="#" th:action="@{/saveEmployee}" method="post">
			<label>First Name:</label> <input type="text" th:field="*{firstName}" /><br />

			<label>Last Name:</label> <input type="text" th:field="*{lastName}" /><br />

			<label>Technology:</label>
		    <select name="technology" id="technology">
				<option value="Java">Java</option>
				<option value=".Net">.Net</option>
				<option value="Python">Python</option>
			</select><br /> 
			<label>Birthday (yyyy-mm-dd):</label> <input type="text"
				th:field="*{birthday}" /><br />
		    <label>Gender:</label>
	    	<input type="radio" th:field="*{gender}" value="Male" />Male <input
				type="radio" th:field="*{gender}" value="Female" />Female<br />
		    <label>Designation:</label>
			<input th:field="*{designation}" value="designation"></input> <br /> 
			<label>Married?</label> 
			<input type="checkbox" th:field="*{married}" /><br />
		    <label>Address:</label>
			<textarea rows="5" cols="25" th:field="*{addresss}"></textarea>
			<br />

			<button type="submit">Register</button>
		</form>

	</div>


</body>
</html>