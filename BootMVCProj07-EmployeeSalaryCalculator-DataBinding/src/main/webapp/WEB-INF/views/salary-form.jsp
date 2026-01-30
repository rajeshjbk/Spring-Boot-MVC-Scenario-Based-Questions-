<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center">Employee Registration
	Page</h1>
<form action="register" method="POST">

	<table border="0" align="center">
		<tr>
			<td>Name::</td>
			<td><input type='text' name="name"></td>
		</tr>

		<tr>
			<td>Basic Salary::</td>
			<td><input type='text' name="basicSalary"></td>
		</tr>

		<tr>
			<td>HRA::</td>
			<td><input type='text' name="hra"></td>
		</tr>
		
		<tr>
			<td>Tax Percentage::</td>
			<td><input type='text' name="taxPercentage"></td>
		</tr>

		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type='reset' name="cancel"></td>
		</tr>
	</table>
</form>