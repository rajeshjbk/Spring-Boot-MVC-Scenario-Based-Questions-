<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color: red; text-align: center">Student Registration
	Page</h1>
<br>
<br>

<frm:form action="register" modelAttribute="st">

	<table align="center" color="0" bgcolor="cyan">
		<tr>
			<td>Student Id:</td>
			<td><frm:input type="text" path="sid" /></td>
		</tr>

		<tr>
			<td>Student Name:</td>
			<td><frm:input type="text" path="sname" /></td>
		</tr>

		<tr>
			<td>College Name:</td>
			<td><frm:input type="text" path="collegeName" /></td>
		</tr>

		<tr>
			<td>Department:</td>
			<td><frm:input type="text" path="dept" /></td>
		</tr>

		<tr>
			<td>Address:</td>
			<td><frm:input type="textarea" path="addrs" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
</frm:form>