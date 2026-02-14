<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Report Page By
	Pagination:: ${pageData.getNumber()+1}</h1>
<br>
<c:choose>
	<c:when test="${!empty pageData}">
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
			<c:forEach var="vo" items="${pageData.getContent()}">
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
		<b>
			<center>

				<c:if test="${!pageData.isFirst() }">
					<a href="page-report?page=0">First</a>&nbsp;&nbsp;
                </c:if>
				<c:if test="${pageData.hasNext() }">
					<a href="page-report?page=${pageData.getNumber()+1 }">Next</a>&nbsp;&nbsp;
                </c:if>

				<c:forEach var="i" begin="1" end="${pageData.getTotalPages()}" step="1">
					<c:if test="${(pageData.number+1) ne i}">
		                    [<a href="page-report?page=${i-1}">${i}</a>]&nbsp;
		            </c:if>
				</c:forEach>

				<c:if test="${pageData.hasPrevious() }">
					<a href="page-report?page=${pageData.getNumber()-1 }">Previous</a>&nbsp;&nbsp;
				</c:if>

				<c:if test="${!pageData.isLast() }">
					<a href="page-report?page=${pageData.getTotalPages()-1 }">Last</a>
				</c:if>
			</center>

		</b>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records Found</h1>
	</c:otherwise>
</c:choose>
<br>