<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Account</title>
</head>
<body>
	<h2 style="color: red; text-align: center;">Account Summary</h2>
	<b>Account No: ${acc1.accountNumber }</b>
	<br>
	<b>Name: ${acc1.holderName}</b>
	<br>
	<b>Type: ${acc1.accountType}</b>
	<br>
	<b>Branch: ${acc1.branch}</b>
	<br>
	<b>Balance: ₹${acc1.balance}</b>
	<br>
</body>
</html>