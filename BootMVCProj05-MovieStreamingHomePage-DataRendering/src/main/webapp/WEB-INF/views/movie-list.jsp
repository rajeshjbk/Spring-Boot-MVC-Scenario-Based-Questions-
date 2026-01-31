<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movies</title>
</head>
<body>

<h2 style="color:red; text-align:center;">Movies Details</h2>

<c:forEach var="movie" items="${movies}">
    <c:if test="${movie.rating >= 8}">
        <b>${movie.title} | ${movie.genre} | ${movie.rating} | ${movie.language}</b>
        <br/>
    </c:if>
</c:forEach>

</body>
</html>
