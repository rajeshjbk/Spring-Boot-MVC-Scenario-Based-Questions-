<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:red; text-align:center"> Student Edit Page</h1> <br>

<frm:form modelAttribute="student">
	<table border="0" bgcolor="cyan" align="center">
		
		<tr>
			<td>Id:</td>
			<td><frm:input type="text" path="id" readonly="true"/></td>
		</tr>
		
		<tr>
			<td>Student Name:</td>
			<td><frm:input type="text" path="studentName" /></td>
		</tr>

		<tr>
			<td>Email:</td>
			<td><frm:input type="text" path="email" /></td>
		</tr>

		<tr>
			<td>Course:</td>
			<td><frm:input type="text" path="course" /></td>
		</tr>

		<tr>
			<td>Semester:</td>
			<td><frm:input type="text" path="semester" /></td>
		</tr>
		
		<tr>
			<td>Registration Date:</td>
			<td><frm:input type="text" path="registrationDate" /></td>
		</tr>
		
		<tr>
			<td>Status:</td>
			<td><frm:input type="text" path="status" /></td>
		</tr>
		
		<tr>
		   <td><input type="submit" value="Edit Student"></td>
		   <td><input type="reset" value="Cancel"></td>
		</tr>
		
	</table>
</frm:form>