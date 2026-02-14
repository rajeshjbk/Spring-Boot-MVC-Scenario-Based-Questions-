<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Report Page</h1>
<br>
<c:choose>
	<c:when test="${!empty listVO}">
		<table border="1" align="center" bgcolor="cyan">
			<tr bgcolor="yellow">
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Course</th>
				<th>Semester</th>
				<th>Registration Date</th>
				<th>Status</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="vo" items="${listVO}">
				<tr>
					<td>${vo.id}</td>
					<td>${vo.studentName}</td>
					<td>${vo.email}</td>
					<td>${vo.course}</td>
					<td>${vo.semester}</td>
					<td>${vo.registrationDate}</td>
					<td>${vo.status}</td>
					<td><a href="edit?no=${vo.id }"><img src="images/update.jpg" width="30" height="30"></a>
					    &nbsp; &nbsp;
					    <a href="delete?no=${vo.id }" onclick="return confirm('Are You sure to Delete?')"><img src="images/delete.jpg" width="30" height="30"></a>
					</td>
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
<h1 style="text-align: center">
	<a href="add">Add Student <img src="images/add.png" width="100" height="150"></a>
</h1>

<h1 style="text-align: center">
	<a href="./">Home <img src="images/home.jpg" width="100" height="150"></a>
</h1>