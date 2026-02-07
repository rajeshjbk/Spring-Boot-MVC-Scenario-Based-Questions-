<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color: red; text-align: center">Student Report</h1>
<br>

<c:choose>
	<c:when test="${!empty listVO}">
		<table border="1" align="center" bgcolor="cyan">
			<tr bgcolor="yellow">
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Course</th>
				<th>Fee</th>
				<th>Marks</th>
				<th>Result</th>
			</tr>
			<c:forEach var="vo" items="${listVO}">
				<tr>
					<td>${vo.id}</td>
					<td>${vo.name}</td>
					<td>${vo.email}</td>
					<td>${vo.course}</td>
					<td>${vo.fee}</td>
					<td>${vo.marks}</td>
					<td>${vo.result}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records Found</h1>
	</c:otherwise>
</c:choose>
<br>



<h2 style="text-align: center; color: red">${resultMsg}</h2>
<br>
<br>
<a href="add"><h2 align="center">
		Add Student<img src="images/add.png" width="200" />
	</h2></a>

<br>
<br>
<a href="./"><h2 align="center">
		Home<img src="images/home.jpg" width="200" />
	</h2></a>

