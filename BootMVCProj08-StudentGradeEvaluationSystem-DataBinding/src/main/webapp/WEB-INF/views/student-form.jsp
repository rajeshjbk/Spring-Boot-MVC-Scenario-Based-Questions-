<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center">Student Registration
	Page</h1>
<form action="register" method="POST">

	<table border="0" align="center">
		<tr>
			<td>Name::</td>
			<td><input type='text' name="studentName"></td>
		</tr>

		<tr>
			<td>Marks::</td>
			<td><input type='text' name="marks"></td>
		</tr>

		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type='reset' value="Cancel"></td>
		</tr>
	</table>
</form>