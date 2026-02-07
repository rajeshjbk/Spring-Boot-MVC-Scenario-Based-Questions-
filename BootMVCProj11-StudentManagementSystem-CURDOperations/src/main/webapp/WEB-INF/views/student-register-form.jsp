<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>


<h1 style="color:red; text-align:center">New Student Registration Form</h1>


<frm:form modelAttribute="stuVO">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Name:</td>
			<td><frm:input type="text" path="name" /></td>
		</tr>

		<tr>
			<td>Email Id:</td>
			<td><frm:input type="text" path="email" /></td>
		</tr>

		<tr>
			<td>Course:</td>
			<td><frm:input type="text" path="course" /></td>
		</tr>

		<tr>
			<td>Fee:</td>
			<td><frm:input type="text" path="fee" /></td>
		</tr>
		<tr>
			<td>Marks:</td>
			<td><frm:input type="text" path="marks" /></td>
		</tr>
		
		<tr>
		   <td><input type="submit" value="Register"></td>
		   <td><input type="reset" value="Cancel"></td>
		</tr>
		
	</table>
</frm:form>