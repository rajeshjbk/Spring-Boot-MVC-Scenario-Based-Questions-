<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center">Loan Registration
	Page</h1>
<form action="register" method="POST">

	<table border="0" align="center">
		<tr>
			<td>Loan Amount::</td>
			<td><input type='text' name="loanAmount"></td>
		</tr>

		<tr>
			<td>Interest Rate::</td>
			<td><input type='text' name="interestRate"></td>
		</tr>
		
		<tr>
			<td>Tenure Months::</td>
			<td><input type='text' name="tenureMonths"></td>
		</tr>

		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type='reset' value="Cancel"></td>
		</tr>
	</table>
</form>